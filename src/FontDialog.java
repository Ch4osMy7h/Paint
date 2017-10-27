import javax.swing.*;
import java.awt.*;

public class FontDialog extends JDialog {

    public String sizeList[] = {"8", "9", "10", "11", "12", "13", "14", "15", "16", "18", "20", "22", "24", "26", "28", "30"};
    public String fontList[] = {"宋体", "黑体", "楷体"};
    public String shapeList[] = {"通常", "加粗", "斜体"};
    public JComboBox fontBox = new JComboBox(fontList);
    public JComboBox sizeBox = new JComboBox(sizeList);
    public JComboBox shapeBox = new JComboBox(shapeList);

    public FontDialog(MainFrame frame) {
        super(frame, "修改字体", true);
        setAlwaysOnTop(true);
        setSize(200, 100);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(1, 3));
        add(fontBox);
        add(sizeBox);
        add(shapeBox);
        fontBox.setSelectedIndex(1);
        sizeBox.setSelectedIndex(10);
    }

    public Font getFont() {
        return new Font(fontList[fontBox.getSelectedIndex()], shapeBox.getSelectedIndex(), Integer.valueOf(sizeList[sizeBox.getSelectedIndex()]));
    }
}