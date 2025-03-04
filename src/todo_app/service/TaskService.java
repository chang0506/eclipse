package todo_app.service;

import java.util.List;

import todo_app.dto.request.TaskReqDto;
import todo_app.dto.response.TaskRespDto;

public interface TaskService {
	void createTask(TaskReqDto dto);
	List<TaskRespDto> getAllTasks();
	List<TaskRespDto> filterTasksByText(String text);
	void updateText(Long id, TaskReqDto dto);
	void deleteText(Long id);
}
