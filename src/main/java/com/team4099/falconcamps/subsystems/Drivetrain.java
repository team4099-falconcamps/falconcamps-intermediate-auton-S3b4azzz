package com.team4099.falconcamps.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.kauailabs.navx.frc.AHRS;
import com.team4099.falconcamps.commands.ShootCommand;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    private TalonFX left = new TalonFX(2);
    private TalonFX leftFollower = new TalonFX(3);
    private TalonFX right = new TalonFX(12);
    private TalonFX rightFollower = new TalonFX(13);
    private AHRS gyro = new AHRS(SPI.Port.kMXP);
    public PIDController controller = new PIDController(shooterP, shoooterI, shooterD)
}
    public Drivetrain() {
        leftFollower.follow(left);
        rightFollower.follow(right);


        left.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
        right.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
    }

    public double getGyroAngle() {
        return gyro.getAngle();
    }

    public double MeasurementInMetersleft() {
        return encoderTicksToMeters(left.getSelectedSensorPosition());
    }
    public double MeasurementInMetersRight() {
        return encoderTicksToMeters(right.getSelectedSensorPosition());
    }


    public void setLRPower(double leftPower, double rightPower) {
        left.set(ControlMode.PercentOutput, leftPower);
        right.set(ControlMode.PercentOutput, rightPower);
    }

    public double encoderTicksToMeters(int nativeUnits) {
        return (nativeUnits / (2048 / 0.08665966387)) * 6 * Math.PI;

    }

    }

}
