import javax.accessibility.AccessibleContext;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.awt.dnd.DropTarget;
import java.awt.event.*;
import java.awt.im.InputContext;
import java.awt.im.InputMethodRequests;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import java.awt.peer.ComponentPeer;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.EventListener;
import java.util.Locale;
import java.util.Set;

/**
 * Calc for BTI v 0.1
 * User: Nordman |  Date: 23.02.14 | Time: 12:56
 */
public class GUI extends JFrame {
    public static JTextField textField_output;
    public static JTextField textField_input;

    private GUI() {

    }

    public GUI(String name) {
        setDefaultLookAndFeelDecorated(true);
        setTitle(name);
        setLayout(new GridLayout(2,1,1,1));
        setVisible(true);
        setLocationRelativeTo(null);
        setBounds(5, 5, 500, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        //Init
        MyPanel panel_top = new MyPanel();
        MyPanel panel_bot = new MyPanel();
        textField_input=new JTextField();
        textField_output=new JTextField();
        JButton button_import = new JButton();
        JButton button_answer = new JButton();
        Buttons_API b1 = new Buttons_API();
        Data_API data_api= new Data_API();

        //Font font = new Font("Courier",Font.ITALIC,15);

        //Panel  addind comps.
        panel_top.setLayout(new FlowLayout());
        panel_bot.setLayout(new FlowLayout());
        panel_top.setVisible(true);
        panel_top.setBackground(new Color(0xFEFFCD));
        panel_bot.setVisible(true);
        panel_bot.setBackground(new Color(0xFEFFCD));

        //Buttons adjust

        button_import.setText("Импорт в строку");
        button_answer.setText("ОТВЕТ =");
        button_import.addActionListener(b1);
        button_answer.addActionListener(b1);



       //Text fields adjust and read data input

        textField_input.setVisible(true);
        textField_input.setColumns(40);
        textField_output.setColumns(5);
        textField_output.setEditable(false);
        textField_output.setFocusable(false);




        //Creating calc
        add(panel_top);
        add(panel_bot);
        panel_top.add(textField_input);
        panel_bot.add(button_import);
        panel_bot.add(button_answer);
        panel_bot.add(textField_output);




    }

    private class MyPanel extends JPanel {

        @Override
        public void updateUI() {
            super.updateUI();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public PanelUI getUI() {
            return super.getUI();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void setUI(ComponentUI componentUI) {
            super.setUI(componentUI);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setUI(PanelUI panelUI) {
            super.setUI(panelUI);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public String getUIClassID() {
            return super.getUIClassID();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected String paramString() {
            return super.paramString();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public AccessibleContext getAccessibleContext() {
            return super.getAccessibleContext();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean getInheritsPopupMenu() {
            return super.getInheritsPopupMenu();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setInheritsPopupMenu(boolean b) {
            super.setInheritsPopupMenu(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public JPopupMenu getComponentPopupMenu() {
            return super.getComponentPopupMenu();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setComponentPopupMenu(JPopupMenu jPopupMenu) {
            super.setComponentPopupMenu(jPopupMenu);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected Graphics getComponentGraphics(Graphics graphics) {
            return super.getComponentGraphics(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void paintChildren(Graphics graphics) {
            super.paintChildren(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void paintBorder(Graphics graphics) {
            super.paintBorder(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void update(Graphics graphics) {
            super.update(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void printAll(Graphics graphics) {
            super.printAll(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void print(Graphics graphics) {
            super.print(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void printComponent(Graphics graphics) {
            super.printComponent(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void printChildren(Graphics graphics) {
            super.printChildren(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void printBorder(Graphics graphics) {
            super.printBorder(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isPaintingTile() {
            return super.isPaintingTile();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isManagingFocus() {
            return super.isManagingFocus();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component getNextFocusableComponent() {
            return super.getNextFocusableComponent();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setNextFocusableComponent(Component component) {
            super.setNextFocusableComponent(component);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isRequestFocusEnabled() {
            return super.isRequestFocusEnabled();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setRequestFocusEnabled(boolean b) {
            super.setRequestFocusEnabled(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void requestFocus() {
            super.requestFocus();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean requestFocus(boolean b) {
            return super.requestFocus(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean requestFocusInWindow() {
            return super.requestFocusInWindow();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected boolean requestFocusInWindow(boolean b) {
            return super.requestFocusInWindow(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void grabFocus() {
            super.grabFocus();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean getVerifyInputWhenFocusTarget() {
            return super.getVerifyInputWhenFocusTarget();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setVerifyInputWhenFocusTarget(boolean b) {
            super.setVerifyInputWhenFocusTarget(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public FontMetrics getFontMetrics(Font font) {
            return super.getFontMetrics(font);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Dimension getPreferredSize() {
            return super.getPreferredSize();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setPreferredSize(Dimension dimension) {
            super.setPreferredSize(dimension);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Dimension getMaximumSize() {
            return super.getMaximumSize();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setMaximumSize(Dimension dimension) {
            super.setMaximumSize(dimension);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Dimension getMinimumSize() {
            return super.getMinimumSize();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setMinimumSize(Dimension dimension) {
            super.setMinimumSize(dimension);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean contains(int i, int i2) {
            return super.contains(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Border getBorder() {
            return super.getBorder();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setBorder(Border border) {
            super.setBorder(border);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Insets getInsets() {
            return super.getInsets();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Insets getInsets(Insets insets) {
            return super.getInsets(insets);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public float getAlignmentY() {
            return super.getAlignmentY();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setAlignmentY(float v) {
            super.setAlignmentY(v);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public float getAlignmentX() {
            return super.getAlignmentX();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setAlignmentX(float v) {
            super.setAlignmentX(v);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public InputVerifier getInputVerifier() {
            return super.getInputVerifier();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setInputVerifier(InputVerifier inputVerifier) {
            super.setInputVerifier(inputVerifier);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Graphics getGraphics() {
            return super.getGraphics();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int getDebugGraphicsOptions() {
            return super.getDebugGraphicsOptions();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setDebugGraphicsOptions(int i) {
            super.setDebugGraphicsOptions(i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void registerKeyboardAction(ActionListener actionListener, String s, KeyStroke keyStroke, int i) {
            super.registerKeyboardAction(actionListener, s, keyStroke, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void registerKeyboardAction(ActionListener actionListener, KeyStroke keyStroke, int i) {
            super.registerKeyboardAction(actionListener, keyStroke, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void unregisterKeyboardAction(KeyStroke keyStroke) {
            super.unregisterKeyboardAction(keyStroke);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public KeyStroke[] getRegisteredKeyStrokes() {
            return super.getRegisteredKeyStrokes();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int getConditionForKeyStroke(KeyStroke keyStroke) {
            return super.getConditionForKeyStroke(keyStroke);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public ActionListener getActionForKeyStroke(KeyStroke keyStroke) {
            return super.getActionForKeyStroke(keyStroke);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void resetKeyboardActions() {
            super.resetKeyboardActions();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int getBaseline(int i, int i2) {
            return super.getBaseline(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public BaselineResizeBehavior getBaselineResizeBehavior() {
            return super.getBaselineResizeBehavior();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean requestDefaultFocus() {
            return super.requestDefaultFocus();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processComponentKeyEvent(KeyEvent keyEvent) {
            super.processComponentKeyEvent(keyEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processKeyEvent(KeyEvent keyEvent) {
            super.processKeyEvent(keyEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected boolean processKeyBinding(KeyStroke keyStroke, KeyEvent keyEvent, int i, boolean b) {
            return super.processKeyBinding(keyStroke, keyEvent, i, b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public String getToolTipText() {
            return super.getToolTipText();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setToolTipText(String s) {
            super.setToolTipText(s);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public String getToolTipText(MouseEvent mouseEvent) {
            return super.getToolTipText(mouseEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Point getToolTipLocation(MouseEvent mouseEvent) {
            return super.getToolTipLocation(mouseEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Point getPopupLocation(MouseEvent mouseEvent) {
            return super.getPopupLocation(mouseEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public JToolTip createToolTip() {
            return super.createToolTip();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void scrollRectToVisible(Rectangle rectangle) {
            super.scrollRectToVisible(rectangle);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean getAutoscrolls() {
            return super.getAutoscrolls();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setAutoscrolls(boolean b) {
            super.setAutoscrolls(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public TransferHandler getTransferHandler() {
            return super.getTransferHandler();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setTransferHandler(TransferHandler transferHandler) {
            super.setTransferHandler(transferHandler);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processMouseEvent(MouseEvent mouseEvent) {
            super.processMouseEvent(mouseEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processMouseMotionEvent(MouseEvent mouseEvent) {
            super.processMouseMotionEvent(mouseEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void enable() {
            super.enable();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void disable() {
            super.disable();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setFocusTraversalKeys(int i, Set<? extends AWTKeyStroke> awtKeyStrokes) {
            super.setFocusTraversalKeys(i, awtKeyStrokes);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void reshape(int i, int i2, int i3, int i4) {
            super.reshape(i, i2, i3, i4);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Rectangle getBounds(Rectangle rectangle) {
            return super.getBounds(rectangle);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Dimension getSize(Dimension dimension) {
            return super.getSize(dimension);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Point getLocation(Point point) {
            return super.getLocation(point);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int getX() {
            return super.getX();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int getY() {
            return super.getY();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int getWidth() {
            return super.getWidth();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int getHeight() {
            return super.getHeight();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isOpaque() {
            return super.isOpaque();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setOpaque(boolean b) {
            super.setOpaque(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void computeVisibleRect(Rectangle rectangle) {
            super.computeVisibleRect(rectangle);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Rectangle getVisibleRect() {
            return super.getVisibleRect();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void firePropertyChange(String s, boolean b, boolean b2) {
            super.firePropertyChange(s, b, b2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void firePropertyChange(String s, int i, int i2) {
            super.firePropertyChange(s, i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void firePropertyChange(String s, char c, char c2) {
            super.firePropertyChange(s, c, c2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void fireVetoableChange(String s, Object o, Object o2) throws PropertyVetoException {
            super.fireVetoableChange(s, o, o2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void addVetoableChangeListener(VetoableChangeListener vetoableChangeListener) {
            super.addVetoableChangeListener(vetoableChangeListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void removeVetoableChangeListener(VetoableChangeListener vetoableChangeListener) {
            super.removeVetoableChangeListener(vetoableChangeListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized VetoableChangeListener[] getVetoableChangeListeners() {
            return super.getVetoableChangeListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Container getTopLevelAncestor() {
            return super.getTopLevelAncestor();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void addAncestorListener(AncestorListener ancestorListener) {
            super.addAncestorListener(ancestorListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void removeAncestorListener(AncestorListener ancestorListener) {
            super.removeAncestorListener(ancestorListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public AncestorListener[] getAncestorListeners() {
            return super.getAncestorListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public <T extends EventListener> T[] getListeners(Class<T> tClass) {
            return super.getListeners(tClass);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void addNotify() {
            super.addNotify();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void removeNotify() {
            super.removeNotify();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void repaint(long l, int i, int i2, int i3, int i4) {
            super.repaint(l, i, i2, i3, i4);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void repaint(Rectangle rectangle) {
            super.repaint(rectangle);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void revalidate() {
            super.revalidate();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isValidateRoot() {
            return super.isValidateRoot();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isOptimizedDrawingEnabled() {
            return super.isOptimizedDrawingEnabled();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected boolean isPaintingOrigin() {
            return super.isPaintingOrigin();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void paintImmediately(int i, int i2, int i3, int i4) {
            super.paintImmediately(i, i2, i3, i4);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void paintImmediately(Rectangle rectangle) {
            super.paintImmediately(rectangle);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isDoubleBuffered() {
            return super.isDoubleBuffered();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setDoubleBuffered(boolean b) {
            super.setDoubleBuffered(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public JRootPane getRootPane() {
            return super.getRootPane();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int getComponentCount() {
            return super.getComponentCount();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int countComponents() {
            return super.countComponents();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component getComponent(int i) {
            return super.getComponent(i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component[] getComponents() {
            return super.getComponents();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Insets insets() {
            return super.insets();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component add(Component component) {
            return super.add(component);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component add(String s, Component component) {
            return super.add(s, component);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component add(Component component, int i) {
            return super.add(component, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setComponentZOrder(Component component, int i) {
            super.setComponentZOrder(component, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int getComponentZOrder(Component component) {
            return super.getComponentZOrder(component);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void add(Component component, Object o) {
            super.add(component, o);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void add(Component component, Object o, int i) {
            super.add(component, o, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void addImpl(Component component, Object o, int i) {
            super.addImpl(component, o, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void remove(int i) {
            super.remove(i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void remove(Component component) {
            super.remove(component);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void removeAll() {
            super.removeAll();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public LayoutManager getLayout() {
            return super.getLayout();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setLayout(LayoutManager layoutManager) {
            super.setLayout(layoutManager);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void doLayout() {
            super.doLayout();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void layout() {
            super.layout();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void invalidate() {
            super.invalidate();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void validate() {
            super.validate();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void validateTree() {
            super.validateTree();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Dimension preferredSize() {
            return super.preferredSize();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Dimension minimumSize() {
            return super.minimumSize();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void paintComponents(Graphics graphics) {
            super.paintComponents(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void printComponents(Graphics graphics) {
            super.printComponents(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void addContainerListener(ContainerListener containerListener) {
            super.addContainerListener(containerListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void removeContainerListener(ContainerListener containerListener) {
            super.removeContainerListener(containerListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized ContainerListener[] getContainerListeners() {
            return super.getContainerListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processEvent(AWTEvent awtEvent) {
            super.processEvent(awtEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processContainerEvent(ContainerEvent containerEvent) {
            super.processContainerEvent(containerEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void deliverEvent(Event event) {
            super.deliverEvent(event);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component getComponentAt(int i, int i2) {
            return super.getComponentAt(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component locate(int i, int i2) {
            return super.locate(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component getComponentAt(Point point) {
            return super.getComponentAt(point);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Point getMousePosition(boolean b) throws HeadlessException {
            return super.getMousePosition(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component findComponentAt(int i, int i2) {
            return super.findComponentAt(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Component findComponentAt(Point point) {
            return super.findComponentAt(point);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isAncestorOf(Component component) {
            return super.isAncestorOf(component);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void list(PrintStream printStream, int i) {
            super.list(printStream, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void list(PrintWriter printWriter, int i) {
            super.list(printWriter, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Set<AWTKeyStroke> getFocusTraversalKeys(int i) {
            return super.getFocusTraversalKeys(i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean areFocusTraversalKeysSet(int i) {
            return super.areFocusTraversalKeysSet(i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isFocusCycleRoot(Container container) {
            return super.isFocusCycleRoot(container);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public FocusTraversalPolicy getFocusTraversalPolicy() {
            return super.getFocusTraversalPolicy();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setFocusTraversalPolicy(FocusTraversalPolicy focusTraversalPolicy) {
            super.setFocusTraversalPolicy(focusTraversalPolicy);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isFocusTraversalPolicySet() {
            return super.isFocusTraversalPolicySet();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isFocusCycleRoot() {
            return super.isFocusCycleRoot();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setFocusCycleRoot(boolean b) {
            super.setFocusCycleRoot(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void transferFocusDownCycle() {
            super.transferFocusDownCycle();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void applyComponentOrientation(ComponentOrientation componentOrientation) {
            super.applyComponentOrientation(componentOrientation);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
            super.addPropertyChangeListener(propertyChangeListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void addPropertyChangeListener(String s, PropertyChangeListener propertyChangeListener) {
            super.addPropertyChangeListener(s, propertyChangeListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public String getName() {
            return super.getName();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setName(String s) {
            super.setName(s);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Container getParent() {
            return super.getParent();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public ComponentPeer getPeer() {
            return super.getPeer();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized DropTarget getDropTarget() {
            return super.getDropTarget();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void setDropTarget(DropTarget dropTarget) {
            super.setDropTarget(dropTarget);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public GraphicsConfiguration getGraphicsConfiguration() {
            return super.getGraphicsConfiguration();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Toolkit getToolkit() {
            return super.getToolkit();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isValid() {
            return super.isValid();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isDisplayable() {
            return super.isDisplayable();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isVisible() {
            return super.isVisible();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setVisible(boolean b) {
            super.setVisible(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Point getMousePosition() throws HeadlessException {
            return super.getMousePosition();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isShowing() {
            return super.isShowing();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isEnabled() {
            return super.isEnabled();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setEnabled(boolean b) {
            super.setEnabled(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void enable(boolean b) {
            super.enable(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void enableInputMethods(boolean b) {
            super.enableInputMethods(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void show() {
            super.show();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void show(boolean b) {
            super.show(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void hide() {
            super.hide();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Color getForeground() {
            return super.getForeground();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setForeground(Color color) {
            super.setForeground(color);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isForegroundSet() {
            return super.isForegroundSet();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Color getBackground() {
            return super.getBackground();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setBackground(Color color) {
            super.setBackground(color);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isBackgroundSet() {
            return super.isBackgroundSet();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Font getFont() {
            return super.getFont();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setFont(Font font) {
            super.setFont(font);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isFontSet() {
            return super.isFontSet();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Locale getLocale() {
            return super.getLocale();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setLocale(Locale locale) {
            super.setLocale(locale);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public ColorModel getColorModel() {
            return super.getColorModel();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Point getLocation() {
            return super.getLocation();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setLocation(Point point) {
            super.setLocation(point);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Point getLocationOnScreen() {
            return super.getLocationOnScreen();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Point location() {
            return super.location();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setLocation(int i, int i2) {
            super.setLocation(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void move(int i, int i2) {
            super.move(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Dimension getSize() {
            return super.getSize();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setSize(Dimension dimension) {
            super.setSize(dimension);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Dimension size() {
            return super.size();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setSize(int i, int i2) {
            super.setSize(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void resize(int i, int i2) {
            super.resize(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void resize(Dimension dimension) {
            super.resize(dimension);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Rectangle getBounds() {
            return super.getBounds();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setBounds(Rectangle rectangle) {
            super.setBounds(rectangle);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Rectangle bounds() {
            return super.bounds();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isLightweight() {
            return super.isLightweight();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isPreferredSizeSet() {
            return super.isPreferredSizeSet();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isMinimumSizeSet() {
            return super.isMinimumSizeSet();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isMaximumSizeSet() {
            return super.isMaximumSizeSet();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Cursor getCursor() {
            return super.getCursor();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setCursor(Cursor cursor) {
            super.setCursor(cursor);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isCursorSet() {
            return super.isCursorSet();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void paintAll(Graphics graphics) {
            super.paintAll(graphics);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void repaint() {
            super.repaint();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void repaint(long l) {
            super.repaint(l);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void repaint(int i, int i2, int i3, int i4) {
            super.repaint(i, i2, i3, i4);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean imageUpdate(Image image, int i, int i2, int i3, int i4, int i5) {
            return super.imageUpdate(image, i, i2, i3, i4, i5);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Image createImage(ImageProducer imageProducer) {
            return super.createImage(imageProducer);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Image createImage(int i, int i2) {
            return super.createImage(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public VolatileImage createVolatileImage(int i, int i2) {
            return super.createVolatileImage(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public VolatileImage createVolatileImage(int i, int i2, ImageCapabilities imageCapabilities) throws AWTException {
            return super.createVolatileImage(i, i2, imageCapabilities);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean prepareImage(Image image, ImageObserver imageObserver) {
            return super.prepareImage(image, imageObserver);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean prepareImage(Image image, int i, int i2, ImageObserver imageObserver) {
            return super.prepareImage(image, i, i2, imageObserver);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int checkImage(Image image, ImageObserver imageObserver) {
            return super.checkImage(image, imageObserver);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int checkImage(Image image, int i, int i2, ImageObserver imageObserver) {
            return super.checkImage(image, i, i2, imageObserver);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean getIgnoreRepaint() {
            return super.getIgnoreRepaint();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setIgnoreRepaint(boolean b) {
            super.setIgnoreRepaint(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean inside(int i, int i2) {
            return super.inside(i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean contains(Point point) {
            return super.contains(point);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean postEvent(Event event) {
            return super.postEvent(event);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void addComponentListener(ComponentListener componentListener) {
            super.addComponentListener(componentListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void removeComponentListener(ComponentListener componentListener) {
            super.removeComponentListener(componentListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized ComponentListener[] getComponentListeners() {
            return super.getComponentListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void addFocusListener(FocusListener focusListener) {
            super.addFocusListener(focusListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void removeFocusListener(FocusListener focusListener) {
            super.removeFocusListener(focusListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized FocusListener[] getFocusListeners() {
            return super.getFocusListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void addHierarchyListener(HierarchyListener hierarchyListener) {
            super.addHierarchyListener(hierarchyListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void removeHierarchyListener(HierarchyListener hierarchyListener) {
            super.removeHierarchyListener(hierarchyListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized HierarchyListener[] getHierarchyListeners() {
            return super.getHierarchyListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void addHierarchyBoundsListener(HierarchyBoundsListener hierarchyBoundsListener) {
            super.addHierarchyBoundsListener(hierarchyBoundsListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void removeHierarchyBoundsListener(HierarchyBoundsListener hierarchyBoundsListener) {
            super.removeHierarchyBoundsListener(hierarchyBoundsListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized HierarchyBoundsListener[] getHierarchyBoundsListeners() {
            return super.getHierarchyBoundsListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void addKeyListener(KeyListener keyListener) {
            super.addKeyListener(keyListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void removeKeyListener(KeyListener keyListener) {
            super.removeKeyListener(keyListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized KeyListener[] getKeyListeners() {
            return super.getKeyListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void addMouseListener(MouseListener mouseListener) {
            super.addMouseListener(mouseListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void removeMouseListener(MouseListener mouseListener) {
            super.removeMouseListener(mouseListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized MouseListener[] getMouseListeners() {
            return super.getMouseListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void addMouseMotionListener(MouseMotionListener mouseMotionListener) {
            super.addMouseMotionListener(mouseMotionListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void removeMouseMotionListener(MouseMotionListener mouseMotionListener) {
            super.removeMouseMotionListener(mouseMotionListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized MouseMotionListener[] getMouseMotionListeners() {
            return super.getMouseMotionListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void addMouseWheelListener(MouseWheelListener mouseWheelListener) {
            super.addMouseWheelListener(mouseWheelListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void removeMouseWheelListener(MouseWheelListener mouseWheelListener) {
            super.removeMouseWheelListener(mouseWheelListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized MouseWheelListener[] getMouseWheelListeners() {
            return super.getMouseWheelListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void addInputMethodListener(InputMethodListener inputMethodListener) {
            super.addInputMethodListener(inputMethodListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized void removeInputMethodListener(InputMethodListener inputMethodListener) {
            super.removeInputMethodListener(inputMethodListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public synchronized InputMethodListener[] getInputMethodListeners() {
            return super.getInputMethodListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public InputMethodRequests getInputMethodRequests() {
            return super.getInputMethodRequests();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public InputContext getInputContext() {
            return super.getInputContext();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected AWTEvent coalesceEvents(AWTEvent awtEvent, AWTEvent awtEvent2) {
            return super.coalesceEvents(awtEvent, awtEvent2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processComponentEvent(ComponentEvent componentEvent) {
            super.processComponentEvent(componentEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processFocusEvent(FocusEvent focusEvent) {
            super.processFocusEvent(focusEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processMouseWheelEvent(MouseWheelEvent mouseWheelEvent) {
            super.processMouseWheelEvent(mouseWheelEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processInputMethodEvent(InputMethodEvent inputMethodEvent) {
            super.processInputMethodEvent(inputMethodEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processHierarchyEvent(HierarchyEvent hierarchyEvent) {
            super.processHierarchyEvent(hierarchyEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void processHierarchyBoundsEvent(HierarchyEvent hierarchyEvent) {
            super.processHierarchyBoundsEvent(hierarchyEvent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean handleEvent(Event event) {
            return super.handleEvent(event);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean mouseDown(Event event, int i, int i2) {
            return super.mouseDown(event, i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean mouseDrag(Event event, int i, int i2) {
            return super.mouseDrag(event, i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean mouseUp(Event event, int i, int i2) {
            return super.mouseUp(event, i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean mouseMove(Event event, int i, int i2) {
            return super.mouseMove(event, i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean mouseEnter(Event event, int i, int i2) {
            return super.mouseEnter(event, i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean mouseExit(Event event, int i, int i2) {
            return super.mouseExit(event, i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean keyDown(Event event, int i) {
            return super.keyDown(event, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean keyUp(Event event, int i) {
            return super.keyUp(event, i);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean action(Event event, Object o) {
            return super.action(event, o);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean gotFocus(Event event, Object o) {
            return super.gotFocus(event, o);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean lostFocus(Event event, Object o) {
            return super.lostFocus(event, o);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isFocusTraversable() {
            return super.isFocusTraversable();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isFocusable() {
            return super.isFocusable();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setFocusable(boolean b) {
            super.setFocusable(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean getFocusTraversalKeysEnabled() {
            return super.getFocusTraversalKeysEnabled();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setFocusTraversalKeysEnabled(boolean b) {
            super.setFocusTraversalKeysEnabled(b);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public Container getFocusCycleRootAncestor() {
            return super.getFocusCycleRootAncestor();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void transferFocus() {
            super.transferFocus();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void nextFocus() {
            super.nextFocus();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void transferFocusBackward() {
            super.transferFocusBackward();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void transferFocusUpCycle() {
            super.transferFocusUpCycle();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean hasFocus() {
            return super.hasFocus();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean isFocusOwner() {
            return super.isFocusOwner();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void add(PopupMenu popupMenu) {
            super.add(popupMenu);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void remove(MenuComponent menuComponent) {
            super.remove(menuComponent);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public String toString() {
            return super.toString();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void list() {
            super.list();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void list(PrintStream printStream) {
            super.list(printStream);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void list(PrintWriter printWriter) {
            super.list(printWriter);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
            super.removePropertyChangeListener(propertyChangeListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public PropertyChangeListener[] getPropertyChangeListeners() {
            return super.getPropertyChangeListeners();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void removePropertyChangeListener(String s, PropertyChangeListener propertyChangeListener) {
            super.removePropertyChangeListener(s, propertyChangeListener);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public PropertyChangeListener[] getPropertyChangeListeners(String s) {
            return super.getPropertyChangeListeners(s);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void firePropertyChange(String s, Object o, Object o2) {
            super.firePropertyChange(s, o, o2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void firePropertyChange(String s, byte b, byte b2) {
            super.firePropertyChange(s, b, b2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void firePropertyChange(String s, short i, short i2) {
            super.firePropertyChange(s, i, i2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void firePropertyChange(String s, long l, long l2) {
            super.firePropertyChange(s, l, l2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void firePropertyChange(String s, float v, float v2) {
            super.firePropertyChange(s, v, v2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void firePropertyChange(String s, double v, double v2) {
            super.firePropertyChange(s, v, v2);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public ComponentOrientation getComponentOrientation() {
            return super.getComponentOrientation();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public void setComponentOrientation(ComponentOrientation componentOrientation) {
            super.setComponentOrientation(componentOrientation);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public int hashCode() {
            return super.hashCode();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        public boolean equals(Object o) {
            return super.equals(o);    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();    //To change body of overridden methods use File | Settings | File Templates.
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();    //To change body of overridden methods use File | Settings | File Templates.
        }
    }
}
