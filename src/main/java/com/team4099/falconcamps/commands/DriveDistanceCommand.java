package com.team4099.falconcamps.commands;

import com.team4099.falconcamps.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveDistanceCommand extends CommandBase {
    private double distanceMeters;
    private Drivetrain drivetrain;

    private PIDController controllerleft = new PIDController(0, 0, 0);
    private PIDController controllerright = new PIDController(0, 0, 0);

    @Override
    public void execute() {
        double calculatePowerleft = controllerleft.calculate(drivetrain.MeasurementInMetersleft(), distanceMeters);
        double calculatePowerright = controllerright.calculate(drivetrain.MeasurementInMetersRight(), distanceMeters);
    }


    public DriveDistanceCommand(double distanceMeters, Drivetrain drivetrain) {
        this.distanceMeters = distanceMeters;
        this.drivetrain = drivetrain;
    }
}
