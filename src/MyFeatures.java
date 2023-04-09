
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class MyFeatures {
    
    
    
    public ImageIcon resizePhoto(String picPath, byte[] mediumBLOBpic, int width, int height) {
        ImageIcon myImg;
        
        if (picPath != null) {
            myImg = new ImageIcon(picPath);           
        } 
        else {
            myImg = new ImageIcon(mediumBLOBpic);           

        }
        Image img = myImg.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        ImageIcon myPhoto = new ImageIcon(img);
        
        //BufferedImage bimg = ImageIO.read(new ImageIcon(img));
        //System.out.println(myPhoto.getImage().get);
        return myPhoto;
    }
    
    public String browseImage(JLabel lbl) {
        String path = "";
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));

        // file extension
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Images","jpg","png","gif");
        filec.addChoosableFileFilter(fileFilter);
        int fileState = filec.showOpenDialog(null);

        if (fileState == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filec.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            //imagePath = path;
 
            // display image in jlablel
            // ImageIcon imageIcon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(jLabelPhoto1.getWidth(), jLabelPhoto1.getHeight(), java.awt.Image.SCALE_SMOOTH));
            lbl.setIcon(resizePhoto(path, null, lbl.getWidth(), lbl.getHeight()));
            //label.setIcon(imageIcon);jLabelPhoto1.getWidth(), jLabelPhoto1.getHeight(), java.awt.Image.SC

            //jLabelPhoto1.setIcon(new ImageIcon(path));
        }
        // if the user cancel
        else if (fileState == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Image Selected");

        }
        
        return path;
    }
}
