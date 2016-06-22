package com.leilei.miaomiao.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.attribute.FileTime;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			DiskFileItemFactory fileItemFactory  = new DiskFileItemFactory();
			fileItemFactory.setSizeThreshold(1024*1024*10);
			File tempFile  =  new File("F:\\");
			fileItemFactory.setRepository(tempFile);
			ServletFileUpload fileUpload = new ServletFileUpload(fileItemFactory);
			fileUpload.setSizeMax(1024*1024*10);
			try {
				List<FileItem> items = fileUpload.parseRequest(request);
				for(FileItem fileItem : items){
					//若是一般的表单域，打印信息
					if(fileItem.isFormField()){
						String name =  fileItem.getFieldName();
						String value = fileItem.getString();
						System.out.println(name+"" +value);
					}
					//若是文件域则把文件保存到d:\\files目录下
					else {
						String fieldName = fileItem.getFieldName();
						String fileName = fileItem.getName();
						String contentType= fileItem.getContentType();
						boolean isInMemory = fileItem.isInMemory();
						long sizeInBytes = fileItem.getSize();
						
						System.out.println(fieldName);
						System.out.println(fileName);
						System.out.println(contentType);
						System.out.println(isInMemory);
						System.out.println(sizeInBytes);
						
						InputStream in  = fileItem.getInputStream();
						byte [] buf = new byte [1024];
						int len = 0;
						fileName = "d:\\files\\"+fileName;
						System.out.println(fileName);
						OutputStream out = new FileOutputStream(fileName);
						while ((len = in.read(buf))!=-1){
							out.write(buf, 0, len);
							
						}
						out.close();
						in.close();
					}
				}
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
			
			
	}

}
