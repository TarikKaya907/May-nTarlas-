
package mayintarlasi2;

import javax.swing.ImageIcon;

public class mayininresmi extends mayintarlasi2{
    public ImageIcon mayin(){
        java.net.URL dosyaYolu = getClass().getResource("mayin.jpg");
        ImageIcon resim = new ImageIcon(dosyaYolu);
        return resim;
}
}