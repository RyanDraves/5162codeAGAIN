import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TeleOp;

public class Arm extends Subsystem {

    public Spark bottom_motor = RobotMap.m_arm_bottom;
    public Spark top_motor = RobotMap.m_arm_bottom;

    public void initDefaultCommand() {
    }

    public void forward() {
        bottom_motor.set(1);
        top_motor.set(1);
    }

    public void reverse() {
        bottom_motor.set(-1);
        top_motor.set(-1);
    }

    public void stop() {
        bottom_motor.set(0);
        top_motor.set(0);
    }
}