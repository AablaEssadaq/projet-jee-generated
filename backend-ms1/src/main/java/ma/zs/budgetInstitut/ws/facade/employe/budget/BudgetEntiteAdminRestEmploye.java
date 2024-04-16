package ma.zs.budgetInstitut.ws.facade.employe.budget;

import io.swagger.v3.oas.annotations.Operation;
import ma.zs.budgetInstitut.bean.core.budget.BudgetEntiteAdmin;
import ma.zs.budgetInstitut.dao.criteria.core.budget.BudgetEntiteAdminCriteria;
import ma.zs.budgetInstitut.service.facade.admin.budget.BudgetEntiteAdminAdminService;
import ma.zs.budgetInstitut.ws.converter.budget.BudgetEntiteAdminConverter;
import ma.zs.budgetInstitut.ws.dto.budget.BudgetEntiteAdminDto;
import ma.zs.budgetInstitut.zynerator.controller.AbstractController;
import ma.zs.budgetInstitut.zynerator.dto.FileTempDto;
import ma.zs.budgetInstitut.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/employe/budgetEntiteAdmin/")
public class BudgetEntiteAdminRestEmploye extends AbstractController<BudgetEntiteAdmin, BudgetEntiteAdminDto, BudgetEntiteAdminCriteria, BudgetEntiteAdminAdminService, BudgetEntiteAdminConverter> {


    @Operation(summary = "Finds a list of all budgetEntiteAdmins")
    @GetMapping("")
    public ResponseEntity<List<BudgetEntiteAdminDto>> findAll() throws Exception {
        return super.findAll();
    }


    @Operation(summary = "find by entiteAdmin id")
    @GetMapping("entiteAdmin/id/{id}")
    public List<BudgetEntiteAdminDto> findByEntiteAdminId(@PathVariable Long id) {
        return findDtos(service.findByEntiteAdminId(id));
    }

    @Operation(summary = "find by budget id")
    @GetMapping("budget/id/{id}")
    public List<BudgetEntiteAdminDto> findByBudgetId(@PathVariable Long id) {
        return findDtos(service.findByBudgetId(id));
    }

    @Operation(summary = "Finds a budgetEntiteAdmin and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<BudgetEntiteAdminDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds budgetEntiteAdmins by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<BudgetEntiteAdminDto>> findByCriteria(@RequestBody BudgetEntiteAdminCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated budgetEntiteAdmins by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody BudgetEntiteAdminCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports budgetEntiteAdmins by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody BudgetEntiteAdminCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets budgetEntiteAdmin data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody BudgetEntiteAdminCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }


    public BudgetEntiteAdminRestEmploye(BudgetEntiteAdminAdminService service, BudgetEntiteAdminConverter converter) {
        super(service, converter);
    }


}
