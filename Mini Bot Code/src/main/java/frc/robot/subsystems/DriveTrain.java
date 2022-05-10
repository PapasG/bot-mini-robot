package frc4536.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc4536.robot.Constants;
import frc4536.robot.Constants.DriveInfo;

public class DriveTrain extends SubsystemBase{

    private final DifferentialDrive m_differentialDrive;
    
    private final Spark m_leftMotor;
    private final Spark m_rightMotor;

    public DriveTrain(){
        
        m_rightMotor = new Spark(0);
        m_leftMotor = new Spark(1);

        m_differentialDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);

    }

    public void tankDrive(double leftSpeed, double rightSpeed){
        m_differentialDrive.tankDrive(leftSpeed, rightSpeed, false);
    }

}