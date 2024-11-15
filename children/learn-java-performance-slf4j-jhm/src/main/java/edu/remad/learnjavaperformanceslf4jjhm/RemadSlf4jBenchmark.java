package edu.remad.learnjavaperformanceslf4jjhm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConnection;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpUpgradeHandler;
import jakarta.servlet.http.Part;

/**
 * BenchMarks for Slf4J for Level Info and Debug.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(value = 4, warmups = 2, jvmArgs = { "-Xms2G", "-Xmx2G" })
public class RemadSlf4jBenchmark {

	@State(Scope.Thread)
	public static class RemadSlf4jState {
		public Logger logger = LoggerFactory.getLogger(RemadSlf4jBenchmark.class);
		public HttpServletRequest request = new HttpServletRequestWrapper(new HttpServletRequest() {
			
			@Override
			public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
					throws IllegalStateException {
				return null;
			}
			
			@Override
			public AsyncContext startAsync() throws IllegalStateException {
				return null;
			}
			
			@Override
			public void setCharacterEncoding(String encoding) throws UnsupportedEncodingException {
			}
			
			@Override
			public void setAttribute(String name, Object o) {
			}
			
			@Override
			public void removeAttribute(String name) {
			}
			
			@Override
			public boolean isSecure() {
				return false;
			}
			
			@Override
			public boolean isAsyncSupported() {
				return false;
			}
			
			@Override
			public boolean isAsyncStarted() {
				return false;
			}
			
			@Override
			public ServletContext getServletContext() {
				return null;
			}
			
			@Override
			public ServletConnection getServletConnection() {
				return null;
			}
			
			@Override
			public int getServerPort() {
				return 0;
			}
			
			@Override
			public String getServerName() {
				return null;
			}
			
			@Override
			public String getScheme() {
				return null;
			}
			
			@Override
			public String getRequestId() {
				return null;
			}
			
			@Override
			public RequestDispatcher getRequestDispatcher(String path) {
				return null;
			}
			
			@Override
			public int getRemotePort() {
				return 0;
			}
			
			@Override
			public String getRemoteHost() {
				return null;
			}
			
			@Override
			public String getRemoteAddr() {
				return null;
			}
			
			@Override
			public BufferedReader getReader() throws IOException {
				return null;
			}
			
			@Override
			public String getProtocolRequestId() {
				return null;
			}
			
			@Override
			public String getProtocol() {
				return null;
			}
			
			@Override
			public String[] getParameterValues(String name) {
				return null;
			}
			
			@Override
			public Enumeration<String> getParameterNames() {
				return null;
			}
			
			@Override
			public Map<String, String[]> getParameterMap() {
				return null;
			}
			
			@Override
			public String getParameter(String name) {
				return null;
			}
			
			@Override
			public Enumeration<Locale> getLocales() {
				return null;
			}
			
			@Override
			public Locale getLocale() {
				return null;
			}
			
			@Override
			public int getLocalPort() {
				return 0;
			}
			
			@Override
			public String getLocalName() {
				return null;
			}
			
			@Override
			public String getLocalAddr() {
				return null;
			}
			
			@Override
			public ServletInputStream getInputStream() throws IOException {
				return null;
			}
			
			@Override
			public DispatcherType getDispatcherType() {
				return null;
			}
			
			@Override
			public String getContentType() {
				return null;
			}
			
			@Override
			public long getContentLengthLong() {
				return 0;
			}
			
			@Override
			public int getContentLength() {
				return 0;
			}
			
			@Override
			public String getCharacterEncoding() {
				return null;
			}
			
			@Override
			public Enumeration<String> getAttributeNames() {
				return null;
			}
			
			@Override
			public Object getAttribute(String name) {
				return null;
			}
			
			@Override
			public AsyncContext getAsyncContext() {
				return null;
			}
			
			@Override
			public <T extends HttpUpgradeHandler> T upgrade(Class<T> handlerClass) throws IOException, ServletException {
				return null;
			}
			
			@Override
			public void logout() throws ServletException {
			}
			
			@Override
			public void login(String username, String password) throws ServletException {
			}
			
			@Override
			public boolean isUserInRole(String role) {
				return false;
			}
			
			@Override
			public boolean isRequestedSessionIdValid() {
				return false;
			}
			
			@Override
			public boolean isRequestedSessionIdFromURL() {
				return false;
			}
			
			@Override
			public boolean isRequestedSessionIdFromCookie() {
				return false;
			}
			
			@Override
			public Principal getUserPrincipal() {
				return null;
			}
			
			@Override
			public HttpSession getSession(boolean create) {
				return null;
			}
			
			@Override
			public HttpSession getSession() {
				return null;
			}
			
			@Override
			public String getServletPath() {
				return null;
			}
			
			@Override
			public String getRequestedSessionId() {
				return null;
			}
			
			@Override
			public StringBuffer getRequestURL() {
				return null;
			}
			
			@Override
			public String getRequestURI() {
				return null;
			}
			
			@Override
			public String getRemoteUser() {
				return null;
			}
			
			@Override
			public String getQueryString() {
				return null;
			}
			
			@Override
			public String getPathTranslated() {
				return null;
			}
			
			@Override
			public String getPathInfo() {
				return null;
			}
			
			@Override
			public Collection<Part> getParts() throws IOException, ServletException {
				return null;
			}
			
			@Override
			public Part getPart(String name) throws IOException, ServletException {
				return null;
			}
			
			@Override
			public String getMethod() {
				return null;
			}
			
			@Override
			public int getIntHeader(String name) {
				return 0;
			}
			
			@Override
			public Enumeration<String> getHeaders(String name) {
				return null;
			}
			
			@Override
			public Enumeration<String> getHeaderNames() {
				return null;
			}
			
			@Override
			public String getHeader(String name) {
				return null;
			}
			
			@Override
			public long getDateHeader(String name) {
				return 0;
			}
			
			@Override
			public Cookie[] getCookies() {
				return null;
			}
			
			@Override
			public String getContextPath() {
				return null;
			}
			
			@Override
			public String getAuthType() {
				return null;
			}
			
			@Override
			public String changeSessionId() {
				return null;
			}
			
			@Override
			public boolean authenticate(HttpServletResponse response) throws IOException, ServletException {
				return false;
			}
		});
	}

	@Benchmark
	public void testDebugUnguardedNoParameters(RemadSlf4jState state) {
		state.logger.debug("Test a normal text");
	}

	@Benchmark
	public void testDebugGuardedNoParameters(RemadSlf4jState state) {
		if (state.logger.isDebugEnabled()) {
			state.logger.debug("Test a normal text");
		}
	}
	
	@Benchmark
	public void testDebugGuardedWithParameters(RemadSlf4jState state) {
		if (state.logger.isDebugEnabled()) {
			state.logger.debug("Test a normal text {}", "Lear to do it right");
		}
	}
	
	@Benchmark
	public void testDebugGuardedWithConcatenation(RemadSlf4jState state) {
		if (state.logger.isDebugEnabled()) {
			state.logger.debug("Test a normal text " + state.request);
		}
	}

}
