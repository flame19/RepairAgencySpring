package ua.repair_agency.controller.get_commands;

import org.springframework.ui.Model;

public interface RequestHandleCommand {
    String handleRequest(Model model);
}
