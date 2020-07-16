package com.team4099.falconcamps;

import com.team4099.falconcamps.commands.ShootCommand;
import com.team4099.falconcamps.subsystems.Drivetrain;
import com.team4099.falconcamps.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {
    public Drivetrain drivetrain = new Drivetrain();
    public Shooter shooter = new Shooter();

    public RobotContainer() {
        return new ShooterIdleCommand.withTimeout(0)
        shooter.setDefaultCommand(ShooterIdleCommand);
    }

    public Command getAutonomousCommand() {
        return new ShootCommand(shooter).withTimeout(5);
    }
}
