package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;

@TeleOp(name="justincasecontrollerbreaks", group="Linear Opmode")
public class justincasecontrollerbreaks extends LinearOpMode {

    // public void Driver() {
    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private DcMotor leftSlide;
    private DcMotor rightSlide;



    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        leftSlide = hardwareMap.get(DcMotor.class, "linearslideleft");
        rightSlide = hardwareMap.get(DcMotor.class, "linearslideright");

        leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");



        leftSlide.setDirection(DcMotor.Direction.FORWARD);
        rightSlide.setDirection(DcMotor.Direction.REVERSE);

        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);





        waitForStart();

        while (opModeIsActive()) {
            double rightmotorpower = gamepad1.right_stick_y;
            double leftmotorpower = gamepad1.left_stick_y;
            double power = gamepad1.left_stick_x;
            leftSlide.setPower(power);
            rightSlide.setPower(power);

            leftDrive.setPower(leftmotorpower);
            rightDrive.setPower(rightmotorpower);
            telemetry.addData("Status", "Running");
            telemetry.update();

        }

    }
}
