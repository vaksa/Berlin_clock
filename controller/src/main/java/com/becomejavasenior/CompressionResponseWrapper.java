package com.becomejavasenior;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

public class CompressionResponseWrapper extends HttpServletResponseWrapper{

    private GZIPServletOutputStream servletGzipOS = null;
    private PrintWriter writer = null;
    private Object streamUsed = null;

    public CompressionResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    public GZIPOutputStream getGZIPOutputStream(){
        return this.servletGzipOS.internalGzipOS;
    }

    /* Provide access to a decorated servlet output stream */
    public ServletOutputStream getOutputStream() throws IOException{

        if((streamUsed != null) && (streamUsed != writer)){
            throw new IllegalStateException();
        }

        if(servletGzipOS == null){
            /*  Wrap the original servlet output stream with compression servlet output  */
            servletGzipOS = new GZIPServletOutputStream(getResponse().getOutputStream());

            this.streamUsed = servletGzipOS;
        }

        return servletGzipOS;
    }

    /* Provide access to a decorated print writer */
    public PrintWriter getWriter() throws IOException{

        if((streamUsed != null) && (streamUsed != servletGzipOS)){
            throw new IllegalStateException();
        }

        if(writer == null){
            OutputStreamWriter outputWriter = new OutputStreamWriter(new GZIPServletOutputStream(getResponse().getOutputStream()), getResponse().getCharacterEncoding());
            writer = new PrintWriter(outputWriter);
            streamUsed = writer;
        }

        return writer;
    }


}
