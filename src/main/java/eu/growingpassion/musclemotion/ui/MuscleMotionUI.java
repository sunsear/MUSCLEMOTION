package eu.growingpassion.musclemotion.ui;

import ij.IJ;
import ij.plugin.PlugIn;

public class MuscleMotionUI implements PlugIn {

    public void run(String args) {
        IJ.showMessage("MuscleMotion",
                "measuring heart muscle cell contractions"
        );
    }
}
