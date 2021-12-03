// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  
  // Creates left motors at port 0
  private final Spark leftMotor = new Spark(0);

  // !!! Please create right motors at port 1 !!!

  /** Creates a new RomiDrivetrain. */
  public Drivetrain() {
    // Code that runs during creation

  }

  // For driving robot
  public void tankDrive(double leftMotorSpeed, double rightMotorSpeed) {
    // !!! WRITE CODE HERE !!!
    
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
