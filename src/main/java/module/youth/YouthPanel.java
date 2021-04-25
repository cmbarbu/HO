package module.youth;

import core.model.HOVerwaltung;
import core.module.config.ModuleConfig;

import javax.swing.*;
import java.awt.*;

public class YouthPanel extends JPanel {

    private YouthPlayerView youthPlayerView;
    private YouthTrainingView youthTrainingView;
    private JTabbedPane tabbedPane;

    public YouthPanel(){
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        youthPlayerView = new YouthPlayerView();
        this.tabbedPane = new JTabbedPane();
        this.tabbedPane.addTab(HOVerwaltung.instance().getLanguageString("ls.youth.player"), this.youthPlayerView);
        youthTrainingView = new YouthTrainingView();
        this.tabbedPane.addTab(HOVerwaltung.instance().getLanguageString("ls.youth.training"), this.youthTrainingView);
        add(this.tabbedPane, BorderLayout.CENTER);
    }

    public void storeUserSettings() {
        youthPlayerView.storeUserSettings();
        youthTrainingView.storeUserSettings();
    }
}
