package org.usfirst.frc.team5243.robot.subsystems;

import org.usfirst.frc.team5243.robot.OI;
import org.usfirst.frc.team5243.robot.Robot;
import org.usfirst.frc.team5243.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	private Victor dleftMotor;
	private Victor drightMotor;
	private Victor urightMotor;
	private Victor uleftMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private RobotDrive robotDrive;
	public DriveSubsystem() {
		dleftMotor = new Victor(RobotMap.dleftMotor);
		drightMotor = new Victor(RobotMap.drightMotor);
		urightMotor = new Victor(RobotMap.urightMotor);
		uleftMotor = new Victor(RobotMap.uleftMotor);
		robotDrive = new RobotDrive(dleftMotor, drightMotor, urightMotor, uleftMotor);
		
	}
	public void tankDrive() {
		robotDrive.tankDrive(Robot.m_oi.getLeftStick(), Robot.m_oi.getLeftStick());
	}
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

