import javax.swing.JOptionPane;

public class Couple_Number {
    public static void main(String[] args) {
        // Nhập input dạng chuỗi (String) thông qua hộp thoại
        String str1 = JOptionPane.showInputDialog(null,
                "Nhập số thứ nhất: ", "Nhập dữ liệu",
                JOptionPane.INFORMATION_MESSAGE);
                
        String str2 = JOptionPane.showInputDialog(null,
                "Nhập số thứ hai: ", "Nhập dữ liệu",
                JOptionPane.INFORMATION_MESSAGE);

        // Chuyển đổi từ String sang double
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        // Tính tổng, hiệu, tích, thương
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        String result = "Tổng (Sum): " + sum + "\n"
                      + "Hiệu (Difference): " + difference + "\n"
                      + "Tích (Product): " + product + "\n";
        
        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "Thương (Quotient): " + quotient;
        } else {
            result += "Thương (Quotient): Không thể chia cho 0";
        }
        
        // Hiển thị kết quả
        JOptionPane.showMessageDialog(null, result,
                "Kết quả tính toán", JOptionPane.INFORMATION_MESSAGE);
                
        System.exit(0);
    }
}