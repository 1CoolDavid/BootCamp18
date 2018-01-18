package org.usfirst.frc.team5243.robot.subsystems;

import org.usfirst.frc.team5243.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 *
public class ClimbSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Victor leftMotor;
	private Victor rightMotor;
	private Victor armMotor;
	private Button pnueEx;
	Joystick ljoy;
	Joystick rjoy;
	boolean isOn;
	boolean isPressed;
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void ClimbSubsystem() {
    	 pnueEx = new JoystickButton(ljoy, 1);
    	Joystick ljoy = Robot.m_oi.getLeftStick();
    	Joystick rjoy = Robot.m_oi.getRightStick();
    	armMotor = new Victor(3);
    	boolean isOn = false;
        boolean isPressed = false;
    }
    public void extend() {
    	armMotor.set(.7);
    }
    public void retract() {
    	armMotor.set(0);
    }

    public void telePeriodic(){
        updateToggle();
        if(isOn){
            armMotor.set(.7);
        }else{
            armMotor.set(0);
        }
    }

    public void updateToggle()
    {
        if(ljoy.getRawButton(1)){
            if(!isPressed){
                isOn = !isOn;
                isPressed = true;
            }
        }else{
            isPressed = false;
        }
    }  
}
*/

