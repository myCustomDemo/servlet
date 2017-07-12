import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServletTest extends Mockito {


    @Test
    public void testDoGet() throws Exception {
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        HttpServletResponse mockResponse = mock(HttpServletResponse.class);
        ServletOutputStream mockOutput = mock(ServletOutputStream.class);

        when(mockResponse.getOutputStream()).thenReturn(mockOutput);

        new SimpleServlet().doGet(mockRequest, mockResponse);

        verify(mockResponse).setContentType("text/html");
        verify(mockOutput).println("Hello World!");
    }


}