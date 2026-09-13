package io.github.hglabplh_tech.pseudocode.listener;

import io.github.hglabplh_tech.PseudocodeBaseListener;
import io.github.hglabplh_tech.PseudocodeListener;
import io.github.hglabplh_tech.PseudocodeParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PseudoListen implements PseudocodeListener {

    private PseudoASTCtx.PseudoAST root = null;
    @Override
    public void enterProgram(PseudocodeParser.ProgramContext ctx) {
        this.root = PseudoASTCtx.getRootNode(ctx);
    }

    @Override
    public void exitProgram(PseudocodeParser.ProgramContext ctx) {

    }

    @Override
    public void enterTopLevelItem(PseudocodeParser.TopLevelItemContext ctx) {
        PseudoASTCtx.PseudoAST.addChild(this.root, new PseudoASTCtx.OpContext(ctx, 0, PseudoASTCtx.BlockType.NONE));

    }

    @Override
    public void exitTopLevelItem(PseudocodeParser.TopLevelItemContext ctx) {

    }

    @Override
    public void enterBlock(PseudocodeParser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(PseudocodeParser.BlockContext ctx) {

    }

    @Override
    public void enterStatement(PseudocodeParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(PseudocodeParser.StatementContext ctx) {

    }

    @Override
    public void enterBeginEndBlock(PseudocodeParser.BeginEndBlockContext ctx) {

    }

    @Override
    public void exitBeginEndBlock(PseudocodeParser.BeginEndBlockContext ctx) {

    }

    @Override
    public void enterDeclaration(PseudocodeParser.DeclarationContext ctx) {

    }

    @Override
    public void exitDeclaration(PseudocodeParser.DeclarationContext ctx) {

    }

    @Override
    public void enterConstantDeclaration(PseudocodeParser.ConstantDeclarationContext ctx) {

    }

    @Override
    public void exitConstantDeclaration(PseudocodeParser.ConstantDeclarationContext ctx) {

    }

    @Override
    public void enterTypeDefinition(PseudocodeParser.TypeDefinitionContext ctx) {

    }

    @Override
    public void exitTypeDefinition(PseudocodeParser.TypeDefinitionContext ctx) {

    }

    @Override
    public void enterTypeDefinitionBody(PseudocodeParser.TypeDefinitionBodyContext ctx) {

    }

    @Override
    public void exitTypeDefinitionBody(PseudocodeParser.TypeDefinitionBodyContext ctx) {

    }

    @Override
    public void enterTypeRef(PseudocodeParser.TypeRefContext ctx) {

    }

    @Override
    public void exitTypeRef(PseudocodeParser.TypeRefContext ctx) {

    }

    @Override
    public void enterPrimitiveType(PseudocodeParser.PrimitiveTypeContext ctx) {

    }

    @Override
    public void exitPrimitiveType(PseudocodeParser.PrimitiveTypeContext ctx) {

    }

    @Override
    public void enterArrayType(PseudocodeParser.ArrayTypeContext ctx) {

    }

    @Override
    public void exitArrayType(PseudocodeParser.ArrayTypeContext ctx) {

    }

    @Override
    public void enterListType(PseudocodeParser.ListTypeContext ctx) {

    }

    @Override
    public void exitListType(PseudocodeParser.ListTypeContext ctx) {

    }

    @Override
    public void enterSetType(PseudocodeParser.SetTypeContext ctx) {

    }

    @Override
    public void exitSetType(PseudocodeParser.SetTypeContext ctx) {

    }

    @Override
    public void enterMapType(PseudocodeParser.MapTypeContext ctx) {

    }

    @Override
    public void exitMapType(PseudocodeParser.MapTypeContext ctx) {

    }

    @Override
    public void enterQueueType(PseudocodeParser.QueueTypeContext ctx) {

    }

    @Override
    public void exitQueueType(PseudocodeParser.QueueTypeContext ctx) {

    }

    @Override
    public void enterStackType(PseudocodeParser.StackTypeContext ctx) {

    }

    @Override
    public void exitStackType(PseudocodeParser.StackTypeContext ctx) {

    }

    @Override
    public void enterReferenceType(PseudocodeParser.ReferenceTypeContext ctx) {

    }

    @Override
    public void exitReferenceType(PseudocodeParser.ReferenceTypeContext ctx) {

    }

    @Override
    public void enterPointerType(PseudocodeParser.PointerTypeContext ctx) {

    }

    @Override
    public void exitPointerType(PseudocodeParser.PointerTypeContext ctx) {

    }

    @Override
    public void enterOptionalType(PseudocodeParser.OptionalTypeContext ctx) {

    }

    @Override
    public void exitOptionalType(PseudocodeParser.OptionalTypeContext ctx) {

    }

    @Override
    public void enterFunctionType(PseudocodeParser.FunctionTypeContext ctx) {

    }

    @Override
    public void exitFunctionType(PseudocodeParser.FunctionTypeContext ctx) {

    }

    @Override
    public void enterTypeRefList(PseudocodeParser.TypeRefListContext ctx) {

    }

    @Override
    public void exitTypeRefList(PseudocodeParser.TypeRefListContext ctx) {

    }

    @Override
    public void enterTypeArguments(PseudocodeParser.TypeArgumentsContext ctx) {

    }

    @Override
    public void exitTypeArguments(PseudocodeParser.TypeArgumentsContext ctx) {

    }

    @Override
    public void enterRecordType(PseudocodeParser.RecordTypeContext ctx) {

    }

    @Override
    public void exitRecordType(PseudocodeParser.RecordTypeContext ctx) {

    }

    @Override
    public void enterFieldDeclaration(PseudocodeParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void exitFieldDeclaration(PseudocodeParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void enterEnumType(PseudocodeParser.EnumTypeContext ctx) {

    }

    @Override
    public void exitEnumType(PseudocodeParser.EnumTypeContext ctx) {

    }

    @Override
    public void enterEnumItem(PseudocodeParser.EnumItemContext ctx) {

    }

    @Override
    public void exitEnumItem(PseudocodeParser.EnumItemContext ctx) {

    }

    @Override
    public void enterClassDefinition(PseudocodeParser.ClassDefinitionContext ctx) {

    }

    @Override
    public void exitClassDefinition(PseudocodeParser.ClassDefinitionContext ctx) {

    }

    @Override
    public void enterClassMember(PseudocodeParser.ClassMemberContext ctx) {

    }

    @Override
    public void exitClassMember(PseudocodeParser.ClassMemberContext ctx) {

    }

    @Override
    public void enterFunctionDefinition(PseudocodeParser.FunctionDefinitionContext ctx) {

    }

    @Override
    public void exitFunctionDefinition(PseudocodeParser.FunctionDefinitionContext ctx) {

    }

    @Override
    public void enterProcedureDefinition(PseudocodeParser.ProcedureDefinitionContext ctx) {

    }

    @Override
    public void exitProcedureDefinition(PseudocodeParser.ProcedureDefinitionContext ctx) {

    }

    @Override
    public void enterParameterList(PseudocodeParser.ParameterListContext ctx) {

    }

    @Override
    public void exitParameterList(PseudocodeParser.ParameterListContext ctx) {

    }

    @Override
    public void enterParameter(PseudocodeParser.ParameterContext ctx) {

    }

    @Override
    public void exitParameter(PseudocodeParser.ParameterContext ctx) {

    }

    @Override
    public void enterCallStatement(PseudocodeParser.CallStatementContext ctx) {

    }

    @Override
    public void exitCallStatement(PseudocodeParser.CallStatementContext ctx) {

    }

    @Override
    public void enterReturnStatement(PseudocodeParser.ReturnStatementContext ctx) {

    }

    @Override
    public void exitReturnStatement(PseudocodeParser.ReturnStatementContext ctx) {

    }

    @Override
    public void enterInputStatement(PseudocodeParser.InputStatementContext ctx) {

    }

    @Override
    public void exitInputStatement(PseudocodeParser.InputStatementContext ctx) {

    }

    @Override
    public void enterOutputStatement(PseudocodeParser.OutputStatementContext ctx) {

    }

    @Override
    public void exitOutputStatement(PseudocodeParser.OutputStatementContext ctx) {

    }

    @Override
    public void enterAssignment(PseudocodeParser.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(PseudocodeParser.AssignmentContext ctx) {

    }

    @Override
    public void enterAssignmentOperator(PseudocodeParser.AssignmentOperatorContext ctx) {

    }

    @Override
    public void exitAssignmentOperator(PseudocodeParser.AssignmentOperatorContext ctx) {

    }

    @Override
    public void enterAssignable(PseudocodeParser.AssignableContext ctx) {

    }

    @Override
    public void exitAssignable(PseudocodeParser.AssignableContext ctx) {

    }

    @Override
    public void enterIfStatement(PseudocodeParser.IfStatementContext ctx) {

    }

    @Override
    public void exitIfStatement(PseudocodeParser.IfStatementContext ctx) {

    }

    @Override
    public void enterCaseStatement(PseudocodeParser.CaseStatementContext ctx) {

    }

    @Override
    public void exitCaseStatement(PseudocodeParser.CaseStatementContext ctx) {

    }

    @Override
    public void enterCaseAlternative(PseudocodeParser.CaseAlternativeContext ctx) {

    }

    @Override
    public void exitCaseAlternative(PseudocodeParser.CaseAlternativeContext ctx) {

    }

    @Override
    public void enterOtherwiseAlternative(PseudocodeParser.OtherwiseAlternativeContext ctx) {

    }

    @Override
    public void exitOtherwiseAlternative(PseudocodeParser.OtherwiseAlternativeContext ctx) {

    }

    @Override
    public void enterWhileStatement(PseudocodeParser.WhileStatementContext ctx) {

    }

    @Override
    public void exitWhileStatement(PseudocodeParser.WhileStatementContext ctx) {

    }

    @Override
    public void enterRepeatStatement(PseudocodeParser.RepeatStatementContext ctx) {

    }

    @Override
    public void exitRepeatStatement(PseudocodeParser.RepeatStatementContext ctx) {

    }

    @Override
    public void enterForStatement(PseudocodeParser.ForStatementContext ctx) {

    }

    @Override
    public void exitForStatement(PseudocodeParser.ForStatementContext ctx) {

    }

    @Override
    public void enterForEachStatement(PseudocodeParser.ForEachStatementContext ctx) {

    }

    @Override
    public void exitForEachStatement(PseudocodeParser.ForEachStatementContext ctx) {

    }

    @Override
    public void enterBreakStatement(PseudocodeParser.BreakStatementContext ctx) {

    }

    @Override
    public void exitBreakStatement(PseudocodeParser.BreakStatementContext ctx) {

    }

    @Override
    public void enterContinueStatement(PseudocodeParser.ContinueStatementContext ctx) {

    }

    @Override
    public void exitContinueStatement(PseudocodeParser.ContinueStatementContext ctx) {

    }

    @Override
    public void enterGotoStatement(PseudocodeParser.GotoStatementContext ctx) {

    }

    @Override
    public void exitGotoStatement(PseudocodeParser.GotoStatementContext ctx) {

    }

    @Override
    public void enterLabelStatement(PseudocodeParser.LabelStatementContext ctx) {

    }

    @Override
    public void exitLabelStatement(PseudocodeParser.LabelStatementContext ctx) {

    }

    @Override
    public void enterExpression(PseudocodeParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(PseudocodeParser.ExpressionContext ctx) {

    }

    @Override
    public void enterLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx) {

    }

    @Override
    public void exitLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx) {

    }

    @Override
    public void enterLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx) {

    }

    @Override
    public void exitLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx) {

    }

    @Override
    public void enterEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx) {

    }

    @Override
    public void exitEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx) {

    }

    @Override
    public void enterRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void exitRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void enterAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void exitAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void enterMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void exitMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void enterPowerExpression(PseudocodeParser.PowerExpressionContext ctx) {

    }

    @Override
    public void exitPowerExpression(PseudocodeParser.PowerExpressionContext ctx) {

    }

    @Override
    public void enterUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx) {

    }

    @Override
    public void exitUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx) {

    }

    @Override
    public void enterPostfixExpression(PseudocodeParser.PostfixExpressionContext ctx) {

    }

    @Override
    public void exitPostfixExpression(PseudocodeParser.PostfixExpressionContext ctx) {

    }

    @Override
    public void enterPostfixPart(PseudocodeParser.PostfixPartContext ctx) {

    }

    @Override
    public void exitPostfixPart(PseudocodeParser.PostfixPartContext ctx) {

    }

    @Override
    public void enterCallableExpression(PseudocodeParser.CallableExpressionContext ctx) {

    }

    @Override
    public void exitCallableExpression(PseudocodeParser.CallableExpressionContext ctx) {

    }

    @Override
    public void enterArgumentList(PseudocodeParser.ArgumentListContext ctx) {

    }

    @Override
    public void exitArgumentList(PseudocodeParser.ArgumentListContext ctx) {

    }

    @Override
    public void enterPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx) {

    }

    @Override
    public void exitPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx) {

    }

    @Override
    public void enterExpressionStatement(PseudocodeParser.ExpressionStatementContext ctx) {

    }

    @Override
    public void exitExpressionStatement(PseudocodeParser.ExpressionStatementContext ctx) {

    }

    @Override
    public void enterArrayLiteral(PseudocodeParser.ArrayLiteralContext ctx) {

    }

    @Override
    public void exitArrayLiteral(PseudocodeParser.ArrayLiteralContext ctx) {

    }

    @Override
    public void enterListLiteral(PseudocodeParser.ListLiteralContext ctx) {

    }

    @Override
    public void exitListLiteral(PseudocodeParser.ListLiteralContext ctx) {

    }

    @Override
    public void enterMapLiteral(PseudocodeParser.MapLiteralContext ctx) {

    }

    @Override
    public void exitMapLiteral(PseudocodeParser.MapLiteralContext ctx) {

    }

    @Override
    public void enterMapEntry(PseudocodeParser.MapEntryContext ctx) {

    }

    @Override
    public void exitMapEntry(PseudocodeParser.MapEntryContext ctx) {

    }

    @Override
    public void enterLiteral(PseudocodeParser.LiteralContext ctx) {

    }

    @Override
    public void exitLiteral(PseudocodeParser.LiteralContext ctx) {

    }

    @Override
    public void enterIdentifier(PseudocodeParser.IdentifierContext ctx) {

    }

    @Override
    public void exitIdentifier(PseudocodeParser.IdentifierContext ctx) {

    }

    @Override
    public void enterStatementEnd(PseudocodeParser.StatementEndContext ctx) {

    }

    @Override
    public void exitStatementEnd(PseudocodeParser.StatementEndContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }
}
