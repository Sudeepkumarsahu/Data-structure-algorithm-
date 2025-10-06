class Test  
  { public void finalizes()  
   {   System.out.println("object destroyed");  
   } 
   public static void main(String[] args) 
   { Test t1 = new Test(); 
    System.out.println(t1); 
    t1 = null;   
     
    System.gc();
   } 
  }