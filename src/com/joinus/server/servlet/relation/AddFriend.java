package com.joinus.server.servlet.relation;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joinus.server.manager.activity.ActivityManager;
import com.joinus.server.manager.relation.FriendManager;
import com.joinus.server.servlet.BaseServlet;

/**
 * Servlet implementation class AddFriend
 */
public class AddFriend extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFriend() {
        super();
        /**请求的参数列表*/
    	parametersName = new String[]{"uid","friend_id","phone_no"};
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HashMap<String, String> parameters = doParameters(request);
		String json = FriendManager.getInstance().addFriend(parameters);
		response.getOutputStream().write(json.getBytes());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
