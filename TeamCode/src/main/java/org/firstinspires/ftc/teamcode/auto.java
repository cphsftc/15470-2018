package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="Stupid Auton", group="Auton")
public class auto extends LinearOpMode {

    @Override
    public void runOpMode() throws IllegalMonitorStateException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        OurBot bot = new OurBot(hardwareMap);
        bot.move(-1.0, -1.0);
        sleep(4000);
        bot.stop();
    }
}

