package duke.command;

import duke.storage.Storage;
import duke.task.Task;
import duke.task.TaskList;
import duke.ui.Ui;


/**
 * Class of MarkCommand that set task as completed.
 */
public class MarkCommand extends Command {
    private int id;

    /**
     * Constructor for MarkCommand.
     *
     * @param cmd the command given by the user.
     */
    public MarkCommand(String cmd) {
        this.id = Integer.parseInt(cmd);
    }

    /**
     * Override execute method from the abstract class of Command.
     *
     * @param tl       - list of tasks.
     * @param ui       - interface.
     * @param storage  - harddisk store using textfile.
     * @return String  - returns the result of the command execution.
     */
    public String execute(TaskList tl, Ui ui, Storage storage) {
        Task task = tl.getTask(this.id - 1);
        task.setMark();
        return "Nice! I've marked this duke.task as done:\n" + task;
    }
}
