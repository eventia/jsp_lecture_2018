package com.javalec.ex6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleEx
 */
@WebServlet("/LifeCycleEx")
public class LifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		// doGet(request, response);
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
//		super.init();
		System.out.println("init");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
//		super.destroy();
		System.out.println("destroy");
	}
	
	@PostConstruct 
	private void initPostConstruct() {
		System.out.println("initPostConstruct");
	}
	
	@PreDestory
	private void destoryPreDestory() {
		System.out.println("destoryPreDestory");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
//		super.init();
		System.out.println("init");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
//		super.destroy();
		System.out.println("destroy");
	}
}
