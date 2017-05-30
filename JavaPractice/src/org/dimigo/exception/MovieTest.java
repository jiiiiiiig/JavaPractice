package org.dimigo.exception;

/**
 * <pre>
 *  org.dimigo.exception
 *  └MovieTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 29.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class MovieTest extends Exception{
	public static void main(String[] args) {
		Movie[] movies = {
				new Movie("에이리언:커버넌트",15),
				new Movie("가디언즈 오브 갤럭시",12)
		};
		int age = 13;
		for(Movie movie : movies){
			try {
				movie.buyTicket(age);
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
