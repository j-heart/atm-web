package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.atm.model.BankAccount;

@Controller
@RequestMapping("/bankaccount")
public class BankAccountController {

    @GetMapping
    public String getBankAccountPage() {
        return "bankaccount";
    }

    @PostMapping
    public String BankSaving(@ModelAttribute BankAccount bankAccount, Model model){
        return "redirect:bankaccount";
    }
}
