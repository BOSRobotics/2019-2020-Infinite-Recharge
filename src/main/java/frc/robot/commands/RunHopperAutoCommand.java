package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class RunHopperAutoCommand extends Command {

    public RunHopperAutoCommand() {
        requires(Robot.hopper);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
       
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       Robot.hopper.setMotorSpeed(-0.75);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (this.timeSinceInitialized() > 5.0)
        {
            return true;
        }
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.hopper.setMotorSpeed(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
       end();
    }
}