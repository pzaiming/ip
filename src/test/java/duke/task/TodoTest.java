//@@author pzaiming-reused
//Reused from https://github.com/RyanQiu1
// with minor modifications
package duke.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoTest {
    @Test
    public void dummyTest() {
        Task t = new Todo("borrow book");
        assertEquals("[T][ ] borrow book", t.toString());
    }
}