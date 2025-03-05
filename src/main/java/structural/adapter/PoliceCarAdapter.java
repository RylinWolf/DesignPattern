package structural.adapter;

import structural.adapter.adaptee.PoliceLamp;
import structural.adapter.adaptee.PoliceSound;
import structural.adapter.target.AbstractCarController;

/**
 * @author linexsong
 */
public class PoliceCarAdapter extends AbstractCarController {
    private final PoliceLamp lamp;
    private final PoliceSound sound;

    public PoliceCarAdapter() {
        this.lamp = new PoliceLamp();
        this.sound = new PoliceSound();
    }

    @Override
    public void phonate() {
        sound.alarmSound();
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }
}
