package com.team4099.falconcamps.commands;

import com.team4099.falconcamps.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.controller.PIDController;

public class TurnAngleCommand {
    private double angleDegrees;
    private Drivetrain drivetrain;
     private PIDController controller = new PIDController(shooterP, shoooterI, shooterD);

    public TurnAngleCommand(double angleDegrees, Drivetrain drivetrain) {
        this.angleDegrees = angleDegrees;
        this.drivetrain = drivetrain;
    }
}
