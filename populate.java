import java.sql.*;
import java.util.*;

import com.sun.org.slf4j.internal.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.*;
public class populate {

	public static void main(String[] args) {
		
		int stagnant = 1;
		
		
		//Populate movie_actors table
		
		
		try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
        Statement executeEvery = con.createStatement();
        executeEvery.executeUpdate("delete from m_actors");
		PreparedStatement prepStat = con.prepareStatement("INSERT INTO m_actors VALUES(?,?,?,?)"); 
        URL assign=new URL("file:///Users/haribharath/Desktop/data/movie_actors.dat");
			BufferedReader stringReader=new BufferedReader(new InputStreamReader(assign.openStream()));
			String line;
			String[] column={};
			int initial = 0;
			while((line=stringReader.readLine())!=null)
			{
				if(initial == 0)
				{
					initial=stagnant;
					continue;
				}
				column=line.split("\\t");

				column[stagnant+2] = column[column.length - 1];
				   prepStat.setString(stagnant,column[0]); 
		           prepStat.setString(stagnant+1,column[1]); 
		           prepStat.setString(stagnant+2,column[2]); 
		           prepStat.setString(stagnant+3,column[3]); 		           
		           prepStat.executeUpdate(); 
			}
        executeEvery.close();
    }catch(Exception e){
        e.printStackTrace();
    }
		
			
	
//		//populate movie_directors
		
		try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
        Statement executeEvery = con.createStatement();
        executeEvery.executeUpdate("delete from m_directors");
		PreparedStatement prepStat = con.prepareStatement("INSERT INTO m_directors VALUES(?,?,?)"); 

        URL assign=new URL("file:///Users/haribharath/Desktop/data/movie_directors.dat");
			BufferedReader stringReader=new BufferedReader(new InputStreamReader(assign.openStream()));

			String line;
			String[] column={};
        int initial= 0;
			while((line=stringReader.readLine())!=null)
			{
				if(initial==0)
				{
					initial=stagnant;
					continue;
				}


				column=line.split("\\t");


				   prepStat.setString(stagnant,column[0]); 
		           prepStat.setString(stagnant+1,column[1]); 
		           prepStat.setString(stagnant+2,column[2]); 
		          

		           
		           prepStat.executeUpdate(); 
			}
        executeEvery.close();
    }catch(Exception e){
        e.printStackTrace();
    }
		
		
//		
//		//populate movie genres
		
		try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
        Statement executeEvery = con.createStatement();
        executeEvery.executeUpdate("delete from m_genres");
		PreparedStatement prepStat = con.prepareStatement("INSERT INTO m_genres VALUES(?,?)"); 

        URL assign=new URL("file:///Users/haribharath/Desktop/data/movie_genres.dat");
			BufferedReader stringReader=new BufferedReader(new InputStreamReader(assign.openStream()));

			String line;
			String[] column={};
			int initial = 0;
			while((line=stringReader.readLine())!=null)
			{
				if(initial == 0)
				{
					initial=stagnant;
					continue;
				}


				column=line.split("\\t");

				   prepStat.setString(stagnant,column[0]); 
		           prepStat.setString(stagnant+1,column[1]); 
		           
		           prepStat.executeUpdate(); 
			}
        executeEvery.close();
    }catch(Exception e){
        e.printStackTrace();
    }
		
		
//	
//		//populate movietags 
//		
		
		
		try {
	          Class.forName("com.mysql.jdbc.Driver");
	          Connection con = DriverManager.getConnection(
	                  "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
	          Statement executeEvery = con.createStatement();
	          executeEvery.executeUpdate("delete from m_tags");
	  		PreparedStatement prepStat = con.prepareStatement("INSERT INTO m_tags VALUES(?,?,?)"); 

	          URL assign=new URL("file:///Users/haribharath/Desktop/data/movie_tags.dat");
				BufferedReader stringReader=new BufferedReader(new InputStreamReader(assign.openStream()));

				String line;
				String[] column={};
	          int initial= 0;
				while((line=stringReader.readLine())!=null)
				{
					if(initial==0)
					{
						initial=stagnant;
						continue;
					}


					column=line.split("\\s");
					for(int iter=3;iter<column.length;iter++)
					{
						column[stagnant]+=" "+column[iter]+" ";
					}

					   prepStat.setString(stagnant,column[0]); 
			           prepStat.setString(stagnant+1,column[1]); 
			           prepStat.setString(stagnant+2,column[2]); 
			          

			           
			           prepStat.executeUpdate(); 
				}
	          executeEvery.close();
	      }catch(Exception e){
	          e.printStackTrace();
	      }
	
//		
//		//populate tags
		
		
		
		try {
	          Class.forName("com.mysql.jdbc.Driver");
	          Connection con = DriverManager.getConnection(
	                  "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
	          Statement executeEvery = con.createStatement();
	          executeEvery.executeUpdate("delete from tags");
	  		PreparedStatement prepStat = con.prepareStatement("INSERT INTO tags VALUES(?,?)"); 

	          URL assign=new URL("file:///Users/haribharath/Desktop/data/tags.dat");
				BufferedReader stringReader=new BufferedReader(new InputStreamReader(assign.openStream()));

				String line;
				String[] column={};
				int initial = 0;
				while((line=stringReader.readLine())!=null)
				{
					if(initial == 0)
					{
						initial=stagnant;
						continue;
					}


					column=line.split("\\t");

					   prepStat.setString(stagnant,column[0]); 
			           prepStat.setString(stagnant+1,column[1]); 
			           
			           prepStat.executeUpdate(); 
				}
	          executeEvery.close();
	      }catch(Exception e){
	          e.printStackTrace();
	      }
//			
//		//populate userrated movies timestamps
		
		try {
	          Class.forName("com.mysql.jdbc.Driver");
	          Connection con = DriverManager.getConnection(
	                  "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
	          Statement executeEvery = con.createStatement();
	          executeEvery.executeUpdate("delete from userratedmovies_ts");
	  		PreparedStatement prepStat = con.prepareStatement("INSERT INTO userratedmovies_ts VALUES(?,?,?,?)"); 
	          URL assign=new URL("file:///Users/haribharath/Desktop/data/user_ratedmovies-timestamps.dat");
				BufferedReader stringReader=new BufferedReader(new InputStreamReader(assign.openStream()));
				String line;
				String[] column={};
				int initial = 0;
				while((line=stringReader.readLine())!=null)
				{
					if(initial == 0)
					{
						initial=stagnant;
						continue;
					}
					column=line.split("\\s");
					for(int iter=stagnant+2;iter<column.length-1;iter++)
					{
						column[stagnant+1]+=" "+column[iter];
					}
					column[stagnant+2] = column[column.length - 1];
					   prepStat.setString(stagnant,column[0]); 
			           prepStat.setString(stagnant+1,column[1]); 
			           prepStat.setString(stagnant+2,column[2]); 
			           prepStat.setString(stagnant+3,column[3]); 		           
			           prepStat.executeUpdate(); 
				}
	          executeEvery.close();
	      }catch(Exception e){
	          e.printStackTrace();
	      }
	
//     populate usertaggedmovies_ts		
		
		
		try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
        Statement executeEvery = con.createStatement();
        executeEvery.executeUpdate("delete from usertaggedmovies_ts");
		PreparedStatement prepStat = con.prepareStatement("INSERT INTO usertaggedmovies_ts VALUES(?,?,?,?)"); 
        URL assign=new URL("file:///Users/haribharath/Desktop/data/user_taggedmovies-timestamps.dat");
			BufferedReader stringReader=new BufferedReader(new InputStreamReader(assign.openStream()));
			String line;
			String[] column={};
			int initial = 0;
			while((line=stringReader.readLine())!=null)
			{
				if(initial == 0)
				{
					initial=stagnant;
					continue;
				}
				column=line.split("\\s");
				for(int iter=stagnant+2;iter<column.length-1;iter++)
				{
					column[stagnant+1]+=" "+column[iter];
				}
				column[stagnant+2] = column[column.length - 1];
				   prepStat.setString(stagnant,column[0]); 
		           prepStat.setString(stagnant+1,column[1]); 
		           prepStat.setString(stagnant+2,column[2]); 
		           prepStat.setString(stagnant+3,column[3]); 		           
		           prepStat.executeUpdate(); 
			}
        executeEvery.close();
    }catch(Exception e){
        e.printStackTrace();
    }
	
	
		
		
//		//populate m_locations
		
		
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
		          Connection con = DriverManager.getConnection(
		                  "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
				Statement executeEvery = con.createStatement();
				executeEvery.executeUpdate("DELETE FROM m_locations");
				executeEvery.close();
				PreparedStatement prepStat = con.prepareStatement("INSERT INTO m_locations VALUES(?,?,?,?,?)");

				URL url=new URL("file:///Users/haribharath/Desktop/data/movie_locations.dat");
				BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
				String alterNate, extraSpace,placeHolderOne,placeHolderTwo,placeHolderThree,placeHolderFour,queryMemory;
	            br.readLine();
	            while ((alterNate = br.readLine()) != null) {
	                String codeBreaker[] = alterNate.split("\t");
	                extraSpace = (codeBreaker.length > 0) ? codeBreaker[stagnant - 1] : "";
	                placeHolderOne = (codeBreaker.length > 1) ? codeBreaker[stagnant] : "";
	                placeHolderTwo = (codeBreaker.length > 2) ? codeBreaker[stagnant + 1] : "";
	                placeHolderThree = (codeBreaker.length > 3) ? codeBreaker[stagnant + 2] : "";
	                placeHolderFour = (codeBreaker.length > 4) ? codeBreaker[stagnant + 3] : "";
	                queryMemory= "INSERT INTO m_locations " + "VALUES (?, ?, ?, ?, ?)";
	                try {
	                	prepStat = con.prepareStatement(queryMemory);
	                	prepStat.setString(stagnant, extraSpace);
	                	prepStat.setString(stagnant + 1, placeHolderOne);
	                	prepStat.setString(stagnant + 2, placeHolderTwo);
	                	prepStat.setString(stagnant + 3, placeHolderThree);
	                	prepStat.setString(stagnant + 4, placeHolderFour);
	                	prepStat.executeUpdate();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    return;
	                } finally {
	                    if (prepStat != null) {
	                        try {
	                        	prepStat.close();
	                        } catch (SQLException ex) {
	                        	ex.printStackTrace();
	                        }
	                        }
	                    }
	                }
			}catch(Exception t) {
				t.printStackTrace();
			}
			
	
		
//   populate movie_countries
        
        try {
	          Class.forName("com.mysql.jdbc.Driver");
	          Connection con = DriverManager.getConnection(
	                  "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
	          Statement executeEvery = con.createStatement();
	          executeEvery.executeUpdate("delete from m_countries");
	  		PreparedStatement prepStat = con.prepareStatement("INSERT INTO m_countries VALUES(?,?)"); 

	          URL assign=new URL("file:///Users/haribharath/Desktop/data/movie_countries.dat");
				BufferedReader stringReader=new BufferedReader(new InputStreamReader(assign.openStream()));

				String line;
				String[] column={};
				int initial = 0;
				while((line=stringReader.readLine())!=null)
				{
					if(initial == 0)
					{
						initial=stagnant;
						continue;
					}


					column=line.split("\\t");
					if(column.length < 2) {
						prepStat.setString(stagnant,column[0]); 
				        prepStat.setString(stagnant+1," "); 
					}else {
						prepStat.setString(stagnant, column[0]);
						prepStat.setString(stagnant + 1, column[1]);
					}
					 			           
			           prepStat.executeUpdate(); 
				}
	          executeEvery.close();
	      }catch(Exception e){
	          e.printStackTrace();
	      }
        
        //populate movies
        
        try {
			Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/IMDB_info", "root", "hari");
	        Statement executeEvery = con.createStatement();
			executeEvery.executeUpdate("DELETE FROM movies");
			executeEvery.close();
			URL assign=new URL("file:///Users/haribharath/Desktop/data/movies.dat");
			BufferedReader br6 = new BufferedReader(new InputStreamReader(assign.openStream()));
	        String line = "";
	        PreparedStatement prepStat = con.prepareStatement("INSERT INTO movies VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	        br6.readLine();
	        while ((line = br6.readLine()) != null) {
	            String codeBreaker[] = line.split("\t");
	            if (codeBreaker.length == 21) {
	                try {
	                    prepStat.setString(stagnant, codeBreaker[0]);
	                    prepStat.setString(stagnant+1, codeBreaker[1]);
	                    prepStat.setString(stagnant+2, codeBreaker[2]);
	                    prepStat.setString(stagnant+3, codeBreaker[3]);
	                    prepStat.setString(stagnant+4, codeBreaker[4]);
	                    prepStat.setString(stagnant+5, codeBreaker[5]);
	                    prepStat.setString(stagnant+6, codeBreaker[6]);
	                    prepStat.setString(stagnant+7, codeBreaker[7]);
	                    prepStat.setString(stagnant+8, codeBreaker[8]);
	                    prepStat.setString(stagnant+9, codeBreaker[9]);
	                    prepStat.setString(stagnant+10, codeBreaker[10]);
	                    prepStat.setString(stagnant+11, codeBreaker[11]);
	                    prepStat.setString(stagnant+12, codeBreaker[12]);
	                    prepStat.setString(stagnant+13, codeBreaker[13]);
	                    prepStat.setString(stagnant+14, codeBreaker[14]);
	                    prepStat.setString(stagnant+15, codeBreaker[15]);
	                    prepStat.setString(stagnant+16, codeBreaker[16]);
	                    prepStat.setString(stagnant+17, codeBreaker[17]);
	                    prepStat.setString(stagnant+18, codeBreaker[18]);
	                    prepStat.setString(stagnant+19, codeBreaker[19]);
	                    prepStat.setString(stagnant+20, codeBreaker[20]);

	                    prepStat.executeUpdate();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                    return;
	                } 
	            }
			
		}
		
				}catch(Exception e) {
					e.printStackTrace();
				}
		
		
		

}
}
