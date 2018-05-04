package org.gsu.justHibernate;

import org.gsu.justHibernate.connection.*;
import org.hibernate.Session;

public class App 
{
	private static Session session;
    public static void main( String[] args )
    {
    	try {
    		 session = Connection.getSessionFactory().openSession();
    		
    		if(session != null) {
    			System.out.println("Connection successfull");
    		}
    		
    	}catch(Exception e) {
    		
    		e.printStackTrace();
    	}
    	finally {
    		if(session != null) {
    			session.close();
    		}
    	}
    }
}
