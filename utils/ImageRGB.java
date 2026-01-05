package utils;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageRGB {
    
    //Record RGB
    public record RGB(int[][] R, int[][] G, int[][] B) {}
    
    //Da file immagine a matrici R, G, B
    public static RGB extractRGB(String imagePath) throws IOException {
        BufferedImage image = ImageIO.read(new File(imagePath));
        
        int width = image.getWidth();
        int height = image.getHeight();
        
        int[][] R = new int[height][width];
        int[][] G = new int[height][width];
        int[][] B = new int[height][width];
        
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                R[y][x] = (pixel >> 16) & 0xFF;
                G[y][x] = (pixel >> 8) & 0xFF;
                B[y][x] = pixel & 0xFF;
            }
        }
        
        return new RGB(R, G, B);
    }
    
    //Da matrici R, G, B a file immagine
    public static void writeRGB(int[][] R, int[][] G, int[][] B, String outputPath) throws IOException {
        int height = R.length;
        int width = R[0].length;
        
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int r = Math.clamp(R[y][x], 0, 255);
                int g = Math.clamp(G[y][x], 0, 255);
                int b = Math.clamp(B[y][x], 0, 255);
                int pixel = (r << 16) | (g << 8) | b;
                image.setRGB(x, y, pixel);
            }
        }
        
        ImageIO.write(image, "png", new File(outputPath));
    }

}