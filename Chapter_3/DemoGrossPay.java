import javax.swing.JOptionPane;
   class DemoGrossPay {
      
      public static void main (String[] args) {
         
        double hourlyRate = 22.75;  
      
        String hours1 = JOptionPane.showInputDialog("Enter hours worked: ");
        double inputHours1 = Double.parseDouble(hours1);
        
        String hours2 = JOptionPane.showInputDialog("Enter hours worked: ");
        double inputHours2 = Double.parseDouble(hours2);
        
        String hours3 = JOptionPane.showInputDialog("Enter hours worked: ");
        double inputHours3 = Double.parseDouble(hours3);
        
        System.out.printf("%.1f hours at $%.2f per hour is $%.2f%n", inputHours1, hourlyRate, calculateGross(inputHours1, hourlyRate));
        System.out.printf("%.1f hours at $%.2f per hour is $%.2f%n", inputHours2, hourlyRate, calculateGross(inputHours2, hourlyRate));
        System.out.printf("%.1f hours at $%.2f per hour is $%.2f%n", inputHours3, hourlyRate, calculateGross(inputHours3, hourlyRate));  
        }  
        
        public static double calculateGross(double hours, double rate) {
        return hours * rate;
    }
