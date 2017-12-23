/**
 * To make these tests pass, you will need to create a Minion class with the member variables below.
 * 
 * <code>
 * 			private String name; 
 * 			private int eyes; 
 * 			private String color; 
 * 			private String master;
 * </code>
 * 
 * Create a constructor, and getters and setters for the member variables. If they’re done right, these tests will pass.
 * 
 * **/
public class Minion {
	 private String name; 
	 private int eyes; 
	 private String color; 
	 private String master;
	  Minion(String name,  int eyes, String color, String master){
		  this.name = name;
		  this.color = color;
		  this.master = master;
		  this.eyes = eyes;
	  }
	  public String getName(){
		  return this.name;
	  }
	  public void setName(String name){
		  this.name = name;
	  }
	  public int getEyes(){
		  return this.eyes;
	  }
	  public void setEyes(int eyes){
		  this.eyes = eyes;
	  }
	  public String getColor(){
		  return this.color;
	  }
	  public void setColor(String color){
		  this.color = color;
	  }
	  public String getMaster(){
		  return this.master;
	  }
	  public void setMaster(String master){
		  this.master = master;
	  }
	  public static void main(String[] args) {
		
	}
 
}
