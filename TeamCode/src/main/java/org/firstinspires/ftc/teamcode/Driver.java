package org.firstinspires.ftc.teamcode;

        import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.DcMotorSimple;
        import com.qualcomm.robotcore.hardware.Gamepad;

@TeleOp(name="Driver", group="Linear Opmode")
public class Driver extends LinearOpMode {

    // public void Driver() {
    private DcMotor leftDrive;
    private DcMotor rightDrive;
    // private Gamepad gamepad1 = new Gamepad;


    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        leftDrive = hardwareMap.get(DcMotor.class, "linearslideleft");
        rightDrive = hardwareMap.get(DcMotor.class, "linearslideright");

        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            double power = gamepad2.right_stick_y;
            leftDrive.setPower(power);
            rightDrive.setPower(power);
            telemetry.addData("Status", "Running");
            telemetry.update();


                }

    }
}
