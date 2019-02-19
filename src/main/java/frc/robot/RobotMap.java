/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SPI;
import com.kauailabs.navx.frc.AHRS;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  public static Spark m_left = new Spark(0);            //:LAKJSDL:KAJSDL:KAJSD:LKAJSDL:KJASDJLK
  public static Spark m_right = new Spark(1);
  public static Spark m_arm_bottom = new Spark(2);
  public static Spark m_arm_top = new Spark(3);

  /***********************************************************************
   * navX-MXP:
   * - Communication via RoboRIO MXP (SPI, I2C, TTL UART) and USB.            
   * - See http://navx-mxp.kauailabs.com/guidance/selecting-an-interface.
   * or Onboar
   * navX-Micro:
   * - Communication via I2C (RoboRIO MXP d) and USB.
   * - See http://navx-micro.kauailabs.com/guidance/selecting-an-interface.
   * 
   * Multiple navX-model devices on a single robot are supported.
   ************************************************************************/

  public static AHRS ahrs = new AHRS(SPI.Port.kMXP);

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
