package ua.repair_agency.services.editing;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import ua.repair_agency.entities.forms.OrderEditingForm;

public interface EditingValidator {
    boolean needMasterForThisStatus(OrderEditingForm form, Model model);
    boolean needPreviousPrice(OrderEditingForm form, BindingResult bindingResult, Model model);
}
