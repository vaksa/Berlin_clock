package com.becomejavasenior;


import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPServletOutputStream extends ServletOutputStream{

    GZIPOutputStream internalGzipOS;

    public GZIPServletOutputStream(ServletOutputStream servletOS) throws IOException{
        this.internalGzipOS = new GZIPOutputStream(servletOS);
    }

    @Override
    public void write(int param) throws IOException {
        internalGzipOS.write(param);
    }

    @Override
    public boolean isReady() {
        return true;
    }

    @Override
    public void setWriteListener(WriteListener writeListener) {

    }

}
