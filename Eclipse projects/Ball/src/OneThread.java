class OneThread {
      
       public OneThread() {
            
             System.out.println("��������� �������.");
            
             Counter();
            
             System.out.println("���� ����������� ���� ���������������� ��� ���������.");
             System.out.println("�� � ������� ��������� �������� Pi � ��������: " +
Math.PI * Math.PI);
}

       private void Counter() {

             long num = 0;
            
             while(num < 999999999) {
                    num++;
             }
            
             System.out.println("��������� ������ ��������: " + num);
            
       }
       public static class Main{
    	   public static void main(String args[])
           {
               OneThread ot = new OneThread();
           }

       }
     

}
