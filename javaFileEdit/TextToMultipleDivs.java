import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextToMultipleDivs {

  public static void main(String[] args) throws IOException {
    // Replace with paths to your files
    String inputFilePath = "/home/m0nster/Desktop/Photos/New folder/image_names.txt";
    String outputFilePath = "/home/m0nster/Desktop/output.txt";

    File inputFile = new File(inputFilePath);
    File outputFile = new File(outputFilePath);

    // Check if input file exists
    if (!inputFile.isFile()) {
      System.out.println("Error: Input file not found");
      return;
    }

    List<String> imageNames = readImageNames(inputFile);  // Read image names from input file

    StringBuilder formattedContent = new StringBuilder();

    int imageCount = 0;
    for (String imageName : imageNames) {
      if (imageCount == 0) {
        formattedContent.append("<div>");  // Start a new div for every 3 images
      }
      formattedContent.append("<img src=\"" + imageName + "\" alt=\"\">");
      imageCount++;
      if (imageCount == 3) {
        formattedContent.append("</div>");  // Close the div after 3 images
        imageCount = 0;  // Reset image count for the next div
      }
    }

    // Handle remaining images (less than 3)
    if (imageCount > 0) {
      formattedContent.append("</div>");
    }

    try (FileWriter writer = new FileWriter(outputFile)) {
      writer.write(formattedContent.toString());
    }
    System.out.println("Content formatted and written to " + outputFile.getPath());
  }

  private static List<String> readImageNames(File file) throws IOException {
    List<String> imageNames = new ArrayList<>();
    try (FileReader reader = new FileReader(file)) {
      int charValue;
      StringBuilder imageName = new StringBuilder();
      while ((charValue = reader.read()) != -1) {
        char character = (char) charValue;
        if (character == '\n') {  // Newline signifies end of image name
          imageNames.add(imageName.toString().trim());
          imageName.setLength(0);  // Reset for next image name
        } else {
          imageName.append(character);
        }
      }
      // Add the last image name if it doesn't end with a newline
      if (imageName.length() > 0) {
        imageNames.add(imageName.toString().trim());
      }
    }
    return imageNames;
  }
}
