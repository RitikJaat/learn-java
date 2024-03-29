import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileLoop {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        String imageTemplate = "        <img src=\"IMG_%d.JPG\" alt=\"image\">\n";

        int lastImageNumber = 3000; // Start tracking from before the loop

        for (int j = 3001; j <= 3213; j++) {
            writer.write("    <div class=\"images\">\n");
            int imageNumber = lastImageNumber + 1; // Start from the next number

            // Ensure at least 3 images per div
            for (int k = 0; k < 3; k++) {
                writer.write(String.format(imageTemplate, imageNumber));
                imageNumber++;
            }

            // Add remaining images if available
            while (imageNumber <= j) {
                writer.write(String.format(imageTemplate, imageNumber));
                imageNumber++;
            }

            lastImageNumber = imageNumber - 1; // Update last used number
            writer.write("    </div>\n");
        }

        writer.close();
    }
}