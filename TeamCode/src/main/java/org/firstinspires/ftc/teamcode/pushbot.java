package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.*;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.android.internal.util.Predicate;
import com.qualcomm.*;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import com.qualcomm.ftcrobotcontroller.R;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import static android.os.SystemClock.sleep;
/**
 * Created by juanjose1 on 10/29/16.
 */
@TeleOp(name = "Pushbot" , group = "Teleop")

public class pushbot extends OpMode{

    DcMotor left;
    DcMotor right;
    DcMotor arm;

    Servo leftgrip;
    Servo rightgrip;

    public void init(){

        left = hardwareMap.dcMotor.get("left_drive");
        right = hardwareMap.dcMotor.get("right_drive");

        //arm = hardwareMap.dcMotor.get("arm");

        //leftgrip = hardwareMap.servo.get("left_arm");
        //rightgrip = hardwareMap.servo.get("right_arm");

        right.setDirection(DcMotorSimple.Direction.REVERSE);

    }
    public void loop(){

        float lefty = gamepad1.left_stick_y;
        float righty = gamepad1.right_stick_y;



        left.setPower(lefty);
        right.setPower(righty);

       //float lefty2 = gamepad2.left_stick_y;

       //arm.setPower(lefty2);

        //if (gamepad2.a ){

         //   leftgrip.setPosition(1.0);
        //  rightgrip.setPosition(0.0);


       //else if(gamepad2.b){

           // leftgrip.setPosition(0.0);
          //  rightgrip.setPosition(1.0);


       // }
    }

}
