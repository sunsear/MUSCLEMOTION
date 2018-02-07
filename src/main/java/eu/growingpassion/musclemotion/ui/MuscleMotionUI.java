package eu.growingpassion.musclemotion.ui;

import ij.IJ;
import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

public class MuscleMotionUI implements PlugInFilter {
    public int setup(java.lang.String s, ImagePlus imagePlus) {
        IJ.showMessage("MuscleMotion",
                "measuring heart muscle cell contractions"
        );
        return DOES_STACKS | STACK_REQUIRED;
    }

    public void run(ImageProcessor imageProcessor) {
        IJ.showMessage("Hi!");
    }
}
