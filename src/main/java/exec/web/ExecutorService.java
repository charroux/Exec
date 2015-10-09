package exec.web;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import exec.dto.CodeDTO;

public interface ExecutorService {
	
	/**
	*
	* @return all codes
	*/
	@RequestMapping(value = "/code", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<CodeDTO> getCodes();
	
	/**
	* Return specifications of a code.
	* @param codeId
	* @return code specifications 
	* @throws Exception no code with such an Id
	*/
	@RequestMapping(value = "/code/{codeId}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public CodeDTO getCode(@PathVariable("codeId") long codeId) throws Exception;
	
}
