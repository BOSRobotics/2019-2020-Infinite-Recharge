package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SpinUpShooterCommand extends Command {

    public SpinUpShooterCommand() {
        requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
       
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       Robot.shooter.setmotorspeed(0.64);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (this.timeSinceInitialized() > 5.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.shooter.setmotorspeed(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
       end();
    }
}