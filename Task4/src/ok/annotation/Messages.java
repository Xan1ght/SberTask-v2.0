package ok.annotation;

import static ok.annotation.Paint.*;

@Paint(style = RESET + "\u001B[1m", color = RED)
public class Messages {
    @Paint(style = RESET + "\u001B[3m", color = PURPLE)
    public String happyBirtday() {
        return "С Днём Рождения!";
    }

    @Paint(style = RESET + "\u001B[40m", color = WHITE)
    public String warning() {
        return "Предупреждение";
    }

    @Paint(style = RESET + "\u001B[4m", color = BLUE)
    public String notHappyBirtday() {
        return "Сегодня не твой день рождения...";
    }

    public String error() {
        return "Ошибка";
    }
}
