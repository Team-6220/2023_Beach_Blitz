package frc.robot.subsystems;

import edu.wpi.first.networktables.*;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;
import frc.robot.Constants.TelescopeConstants;
import frc.robot.Constants.WristConstants;

public class VisionSubsystem extends SubsystemBase{
    private final static int aprilTagPipline = 0;
    private NetworkTable mNetworkTable;
    
    public VisionSubsystem(){
        double[] poseArr = NetworkTableInstance.getDefault().getTable("limelight").getEntry("<botpose>").getDoubleArray(new double[6]);
        System.out.println(poseArr[0]);
        System.out.println(poseArr[1]);
        System.out.println(poseArr[2]);
    }

}
